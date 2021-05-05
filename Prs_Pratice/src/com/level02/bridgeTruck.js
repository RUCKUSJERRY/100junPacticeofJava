function test() {

	var _bridge_length = 2;
	var _weight = 10;
    var _truck_weights = [7,4,5,6];

	solution(_bridge_length, _weight, _truck_weights);
}

function solution(bridge_length, weight, truck_weights) {
    let answer = 0;

    let bridge = [];
    // 다리 지나가는 트럭들

    let bridgeChk = 0;
    // 현재 다리의 무게

    for (let i = 0; i < bridge_length; i++) {
        bridge.push(0); 
    }
    // 다리의 길이만큼 다리 배열을 0으로 선언해준다.

    let truck = truck_weights.shift();
    // 무조건 트럭 1대는 다리에 올라오니까 우선 꺼내온다.

    bridge.unshift(truck)
    bridge.pop();
    // 트럭 1대를 다리에 올린다. 올렸으니 맨 마지막 0은 빼준다.

    bridgeChk += truck;
    // 다리 제한 무게 증가

    answer++;
    // 일단 올라갔으니까 무조건 1초는 지난거다.

    while(bridgeChk != 0) {
        console.log(bridge)
        bridgeChk -= bridge.pop();
        // 다리 1칸 이동

        truck = truck_weights.shift();
        // 그 다음 트럭을 하나 꺼내준다.

        if (truck + bridgeChk <= weight) {
        // 꺼내온트럭 + 현재 다리무게가 제한하중보다 같거나 적으면
            bridge.unshift(truck)
            bridgeChk+=truck

        } else {
        // 그렇지 않다는 건 다리에 못들어간다는 뜻, 그럼 이 트럭은 못들어 간다.
            bridge.unshift(0)
            truck_weights.unshift(truck)
            // 그러니 다시 0으로 다리를 초기화 해주고 꺼냈던 트럭을 다시 대기열로 넣어버린다.
        }
        answer++;

    }

    console.log(answer)
    return answer;
}

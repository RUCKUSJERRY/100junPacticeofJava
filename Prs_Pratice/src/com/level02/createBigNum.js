function test() {

	var number = "4177252841"
	var k = 4;

    solution(number, k);
}

function solution(number, k) {
    var answer = '';
    var max = '';
    // 매 순간의 최대값을 저장 해 줄 변수
    var index = 0;
    // 최대값이 저장되었을 때의 그 다음 부터 시작할 위치를 저장할 변수

    for (let i = 0; i < number.length-k; i++) { 
    // 문자열 길이 - 삭제할 숫자 만큼 반복문을 진행한다.
        max = '0';
        // 최대값 변수를 0으로 초기화 (그때그때 최대값을 구해야하기 때문)
            for (let j = index; j <= k+i; j++) {
            // 최대값이 저장된 번지의 +1 지점부터 비교를 시작할 것이다.
            // 언제까지?? 삭제할 숫자의 개수 + 삭제한 숫자 만큼
            // (처음에 그냥 k라고만 했는데 그렇게 하니 최대값 이후의 숫자들을 비교해주지 못하더라)
                if (number[j] == '9') {
                // 해당 문자열 번지의 숫자가 최대값이라면 더 이상 이 반복문에서는 비교할 필요가 없으니 바로 변수에 넣어주고 브레이크
                // 효율성 테스트에서 떨어져서 힌트를 구한 부분
                    max = number[j];
                    index = j+1;
                    break;
                } else if (max < number[j]) {
                // 현재의 최대값이 해당 문자열 번지의 숫자보다 작을때마다 최대값을 계속 초기화해준다.
                    max = number[j];
                    index = j+1;
                    console.log("max : " + max + " index : " + index);
                }

            }
            answer += max;
            // 안쪽 반복문이 완료될때마다 max에는 현재의 최대값이 들어있으니 이 값을 answer에 계속 추가해준다.
    }

    console.log(answer)
    return answer;
}
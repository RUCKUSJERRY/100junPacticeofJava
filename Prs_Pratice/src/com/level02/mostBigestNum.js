function test() {

	var number = [1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 9998];

    solution(number);

}

function solution(numbers) {

    console.log(numbers)

    numbers.sort(function(a, b)  {
    // sort함수 안에 function을 이용하여 a와 b두 수를 비교해준다.

        var temp1 = '' + a + b;
        var temp2 = '' + b + a;
        // 변수 2개를 임의로 선언해서 각각 숫자를 이었을때의 값으로 초기화
        if (temp1 > temp2) return -1;
        // temp1이 크면 앞에 숫자가 더 우선 순위 이므로 놔둔다
        if (temp1 == temp2) return 0;
        // 같으면 놔둔다
        if (temp1 < temp2) return 1;
        // temp2가 크면 뒤에 숫자가 우선 순위 이므로 바꾼다.

      });

      console.log(numbers) 
    var answer = '';
    var zeroChk = 0;
    for (let i = 0; i < numbers.length; i++) {

        zeroChk += numbers[i];
        answer += numbers[i];
    }

    console.log(zeroChk)

        if (zeroChk == 0) {
            answer = '0';
        } 

        console.log(answer)

        return answer;
}
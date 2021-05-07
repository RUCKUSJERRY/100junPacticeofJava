function test() {

	var number = "4177252841"
	var k = 4;

    solution(number, k);
}

function solution(number, k) {
    var answer = '';
    var max = '';
    var index = 0;

    for (let i = 0; i < number.length-k; i++) { 
        max = '0';
            for (let j = index; j <= k+i; j++) {
                if (number[j] == '9') {
                    max = number[j];
                    index = j+1;
                    break;
                } else if (max < number[j]) {
                    max = number[j];
                    index = j+1;
                    console.log("max : " + max + " index : " + index);
                }

            }
            answer += max;
    }

    console.log(answer)
    return answer;
}
function test() {

	var lottos = [44, 1, 0, 0, 31, 25];
	var win_nums = [31, 10, 45, 1, 6, 19];

	

	
	console.log(lottos);
	console.log(win_nums);

	
	solution(lottos, win_nums);
	
	
}





function solution(lottos, win_nums) {
	

	var max = 0;
	// 최고 순위
	var zeroCnt = 0;
	// 알수 없는 숫자의개수
	var min = 0;
	// 0 제외하고 같은 숫자의개수, 최저순위

	for (var i = 0; i < lottos.length; i++) {
	// 로또 번호의 숫자가 0이면 zeroCnt를 ++해준다.	
		if (lottos[i] == 0) {
			zeroCnt++;
		}	
	}

	for (var i = 0; i < lottos.length; i++) {
	// 각각의 번호를 비교하여 같으면 min ++해준다.
		for (var j = 0; j < win_nums.length; j++) {	
			if(lottos[i] == win_nums[j]) {
				min++;
			}		
		}	
	}

	max = zeroCnt + min;
	// 최고 등수의 맞춘 로또 번호 개수

	var answer = [];

	switch (max) {
		case 0:
		case 1:
			answer[0] = 6;	
			break;
		case 2:
			answer[0] = 5;	
			break;
		case 3:
			answer[0] = 4;	
			break;			
		case 4:
			answer[0] = 3;	
			break;
		case 5:
			answer[0] = 2;	
			break;
		case 6:
			answer[0] = 1;	
			break;				
	}

	switch (min) {
		case 0:
		case 1:
			answer[1] = 6;	
			break;
		case 2:
			answer[1] = 5;	
			break;
		case 3:
			answer[1] = 4;	
			break;			
		case 4:
			answer[1] = 3;	
			break;
		case 5:
			answer[1] = 2;	
			break;
		case 6:
			answer[1] = 1;	
			break;				
	}

	console.log(answer)
    return answer;
}


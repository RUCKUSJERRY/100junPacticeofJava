function solution(absolutes, signs) {
    var answer = 0;
    
    for (var i = 0; i < absolutes.length; i++) {
    // 두 배열의 길이가 같으니 1개 배열의 길이만큼 반복   
        if (signs[i]) {
            // true면 +
            answer+=absolutes[i];
        } else {
            // false면 -
            answer-=absolutes[i];
        }  
    }
    return answer;
}
function test() {

var genres = ['c','a','b','a','a','b','b','b','b','c','c','c','d'];
var plays = [1,500,9, 600, 501, 800,500,300,2,2,1,2,100000];

// var genres = ['A', 'B', 'A', 'A', 'B']
// var plays = [500, 600, 150, 800, 2500]
// // [4, 1, 3, 0])
// var genres = ['B', 'A']
// var plays = [500, 600]
// // [1, 0]
// var genres = ['B']
// var plays = [500]
// // [0]
// var genres = ['B', 'A']
// var plays = [600, 500]
// // [0, 1]
// var genres = ['A', 'B']
// var plays = [600, 500]
// // [0, 1]
// var genres = ['A', 'A', 'B']
// var plays = [600, 500, 300]
// // [0, 1, 2]
// var genres = ['A', 'B', 'A']
// var plays = [600, 500, 600]
// // [0, 2, 1]
// var genres = ['A', 'B', 'A']
// var plays = [600, 500, 700]
// // [2, 0, 1]
// var genres = ['A', 'A', 'A']
// var plays = [600, 500, 700]
// // [2, 0]
// var genres = ['A', 'A', 'A']
// var plays = [3, 2, 1]
// // [0, 1]
// var genres = ['classic', 'pop', 'classic', 'classic', 'pop']
// var plays = [500, 600, 150, 800, 2500]
// // [4, 1, 3, 0]
// var genres = ['classic']
// var plays = [2500]
// // [0]
// var genres = ['A', 'B', 'C']
// var plays = [1, 2, 3]
// // [2, 1, 0]
// var genres = ['A', 'B', 'C', 'D']
// var plays = [1, 2, 3, 1]
// // [2, 1, 0, 3]
// var genres = ['A', 'A', 'B', 'A']
// var plays = [2, 2, 2, 3]
// // [3, 0, 2]
// var genres = ['A', 'A', 'B', 'A']
// var plays = [5, 5, 6, 5]
// // [0, 1, 2]
// var genres = ['A', 'A', 'B', 'A', 'B', 'B']
// var plays = [5, 5, 6, 5, 7, 7]
// // [4, 5, 0, 1]
    solution(genres, plays);
}

function solution(genres, plays) {
    var answer = [];
    var list = new Array();

    for (let i = 0; i < genres.length; i++) {
    // 장르, 재생수, 고유번호를 JSON 타입으로 넣어준다.    
        var data = new Object();

        data.number = i;
        data.genres = genres[i];
        data.play = plays[i]; 

        list.push(data)

    }

    list.sort(function (a, b) {
    // 장르순 -> 재생순으로 오름차순 정렬해준다.
        if(a.genres < b.genres) {
            return -1;
        } else if (a.genres > b.genres) {
            return 1;
        } else {
            if (a.play > b.play) {
                return -1;
            }
            return 0;
        }       
    })

    console.log(list)
    
    var playRank = new Array();
    // 재생수 랭크가 내림차순으로 담길 예정인 배열
    var plays = 0;

    for (let i = 0; i < list.length; i++) {
    // 리스트 순으로 정렬해서 장르가 몇개인지 체크한다.
    // 그러면서 장르별 합계도 체크하여 담아준다.
        plays += list[i].play;
        if (i == list.length-1) {
            var data = new Object();
            data.genres = list[i].genres;
            data.plays = plays;

            playRank.push(data)
        } else {
            if (list[i].genres != list[i+1].genres) {
            
                var data = new Object();
                data.genres = list[i].genres;
                data.plays = plays;
                plays = 0;
    
                playRank.push(data)

            }
        }
    }

    playRank.sort(function (a, b) {
    // 재생수 랭킹 내림차순으로 정렬
        return b.plays - a.plays;

    })
    console.log(playRank)

    var count = 0;
    for (let i = 0; i < playRank.length; i++) {
    // 재생수 랭킹 만큼 반복하여 각각의 장르를 2개 or 1개만 출력할 것이다.  
        for (let j = 0; j < list.length; j++) {
        
            if (playRank[i].genres == list[j].genres) {
                // 리스트에 장르와 랭킹의 장르가 같다면
                ++count;
                // 카운트를 1 올려주고
                answer.push(list[j].number) 
                // answer 배열에 해당 장르의 number를 푸시한다.
                if (count == 2) {
                // 그러다가 카운트가 2 가 되면 카운트를 0으로 초기화 하고 안쪽 포문을 멈춰준다. 2개 이상 출력할필요 없으니
                    count = 0;
                    break;
                } else if (count == 1 && playRank[i].genres != list[j].genres || list.length-1 == j) {
                // 그런데 카운트가 1이면서 for문이 끝에 도착했거나 현재 랭킹의 장르와 리스트의 장르가 다르다면
                // 해당 장르는 1개만 있는 것이니 0으로 초기화 하고 안쪽 포문을 멈춰준다.
                    count = 0;
                    break;
                }
   
            }
               
        }
    }
    console.log(list)
    
    console.log(answer)
    return answer;
}
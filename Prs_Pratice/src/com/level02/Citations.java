import java.util.Arrays;

class Citations {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for (int i = 0; i < citations.length; i++) {
            
            int temp = citations.length - i;
            System.out.println("i = " + i + " citations : " + citations[i] + " Temp : " + temp);
            if (temp <= citations[i]) {
                answer = temp;
                break;
            }
            
        }
        
        return answer;
    }
}
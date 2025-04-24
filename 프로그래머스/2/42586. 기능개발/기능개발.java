class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] days = new int[n];  
        int count = 0;          
        
        for (int i = 0; i < n; i++) {
            days[i] = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
        }

        int[] temp = new int[n]; 
        int current = days[0];
        int num = 1;

        for (int i = 1; i < n; i++) {
            if (days[i] <= current) {
                num++;
            } else {
                temp[count++] = num;
                current = days[i];
                num = 1;
            }
        }

        temp[count++] = num;

        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}

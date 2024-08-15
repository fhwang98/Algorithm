class Solution {
    public String[] solution(String[] picture, int k) {
        
        String[] answer = new String[picture.length * k];
        
        for (int i = 0; i < picture.length; i++) { 
            String temp = "";
            
            for (int j = 0; j < picture[i].length(); j++) {
                for (int n = 0; n < k; n++) {
                    temp += picture[i].charAt(j);
                }
            }

            for (int m = 0; m < k; m++) {
                answer[i * k + m] = temp;
            }
        }

        return answer;
    }
}

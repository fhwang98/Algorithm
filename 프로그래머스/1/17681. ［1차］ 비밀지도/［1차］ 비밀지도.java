class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // n : 정사각형 한 변의 길이
        // arr1 : 지도 1
        // arr2 : 지도 2
        String[] answer = new String[arr1.length];
        String temp;
        for (int i = 0; i < arr1.length; i++) {
            temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", temp).replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
}
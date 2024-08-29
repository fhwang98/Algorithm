class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String before = "";
        for (String b : babbling) {
            before = "";
            while (!b.equals("")) {
                if (b.startsWith("aya")) {
                    if (before.equals("aya")) break;
                    b = b.substring(3, b.length());
                    before = "aya";
                } else if (b.startsWith("ye")) {
                    if (before.equals("ye")) break;
                    b = b.substring(2, b.length());
                    before = "ye";
                } else if (b.startsWith("woo")) {
                    if (before.equals("woo")) break;
                    b = b.substring(3, b.length());
                    before = "woo";
                } else if (b.startsWith("ma")) {
                    if (before.equals("ma")) break;
                    b = b.substring(2, b.length());
                    before = "ma";
                } else {
                    break;
                }
            }
            if (b.equals("")) answer++;
            System.out.println(b);
            
        }
        return answer;
    }
}
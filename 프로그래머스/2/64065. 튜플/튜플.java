import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 1.부분집합 배열 만들기
        String[] subset = s.replaceAll("\\{"," ").replaceAll("\\}"," ").trim().split(" , ");
        // 2.부분집합의 길이로 오름차순 정렬
        Arrays.sort(subset,new Comparator<String>(){
           @Override
            public int compare(String o1, String o2){
                return o1.length()-o2.length();
            }
        });
        
        // 3.튜플 리스트 만들기
        List<Integer> tuple = new ArrayList<>();
        
        for(String str : subset){
            // 4.부분집합을 다시 원소 배열로 만들기
            String[] element = str.split(",");
            // 5.새로운 원소만 리스트에 추가
            for(String e : element){
                int num = Integer.parseInt(e);
                if(tuple.contains(num)) continue;
                tuple.add(num);
            }
        }
        
        // 6. 튜플 리스트를 배열로 리턴
        return tuple.stream().mapToInt(Integer::intValue).toArray();
    }
}
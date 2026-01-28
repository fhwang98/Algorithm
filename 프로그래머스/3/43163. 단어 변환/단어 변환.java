import java.util.*;

class Solution {

    static class State {
        String word;
        int steps;

        State(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }

    public int solution(String begin, String target, String[] words) {
        // 1) target이 words에 없으면 변환 불가
        if (Arrays.stream(words).noneMatch(w->w.equals(target))) return 0;

        // 2) 방문 배열
        boolean[] visited = new boolean[words.length];

        // 3) BFS 큐 준비
        Queue<State> queue = new ArrayDeque<>();
        queue.offer(new State(begin, 0));

        // 4) BFS 진행
        while (!queue.isEmpty()) {
            State cur = queue.poll();

            // (a) 목표 도달: BFS 특성상 처음 도달이 최단
            if (cur.word.equals(target)) {
                return cur.steps;
            }

            // (b) 다음으로 갈 수 있는 단어 찾기: words 전체 스캔
            for (int i = 0; i < words.length; i++) {
                if (visited[i]) continue;

                // 한 글자만 다르면 이동 가능
                if (isOneLetterDifferent(cur.word, words[i])) {
                    visited[i] = true; // 큐에 넣는 시점에 방문 처리
                    queue.offer(new State(words[i], cur.steps + 1));
                }
            }
        }

        // 끝까지 못 갔으면 불가능
        return 0;
    }

    private boolean isOneLetterDifferent(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }
}

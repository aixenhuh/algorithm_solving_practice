package programmers.level2;

import java.util.*;

public class Lessons_12939 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        report = hashSet.toArray(new String[0]);
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> warn = new ArrayList<>();


        // 경고 리스트 뽑기
        for(String str : report) {
            String[] s = str.split(" ");
            hm.put(s[1], hm.getOrDefault(s[1], 0)+1);
        }

        Iterator<String> iterator = hm.keySet().iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            if(hm.get(next) >= k) {
                warn.add(next);
            }
        }

        for(String str: report) {
            String[] s = str.split(" ");
            for(int i = 0; i < warn.size(); i++) {
            }
        }

        return new int[]{1,2,3};
    }
}

package programmers.level2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lessons_12985 {

    public static void main(String[] args) {
        solution(8, 4, 7);
    }

    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int count = queue.size() / 2;
        int tmpCnt = 0;

        while(!queue.isEmpty()) {
            int temp1 = queue.poll();
            int temp2 = queue.poll();
            if((temp1 == a || temp1 == b)) {
                queue.add(temp1);
                tmpCnt++;
            }
            if((temp2 == a || temp2 == b)) {
                queue.add(temp2);
                tmpCnt++;
            }
            if(tmpCnt == 2) {
                return answer + 1;
            }
            while(tmpCnt < 1) {
                queue.add(0);
                tmpCnt++;
            }

            if(queue.size() == count) {
                answer++;
                count = count / 2;
            }
            tmpCnt = 0;
        }

        return answer;
    }
}

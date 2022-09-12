package programmers.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class One {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList();
        int truckSum = 0;
        for(int i = 0; i < truck_weights.length; i++) {
            truckSum += truck_weights[i];
            if(truckSum <= weight) {
                queue.add(truck_weights[i]);
            } else {
                truckSum = 0;
                if(queue.size() < 2) answer = answer + bridge_length;
                else answer = answer + (bridge_length * queue.size()/ 2);
                queue.clear();
                i--;
            }
        }

        if(queue.size() > 0) answer = answer + queue.size() + bridge_length;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
    }

}

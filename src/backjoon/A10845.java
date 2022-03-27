package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A10845 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Queue queue = new Queue();

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "push" : queue.push(Integer.parseInt(st.nextToken())); break;
                case "front" : System.out.println(queue.front()); break;
                case "back" : System.out.println(queue.back()); break;
                case "size" : System.out.println(queue.size()); break;
                case "empty" : System.out.println(queue.empty()); break;
                case "pop" : System.out.println(queue.pop()); break;
                default : break;
            }
        }
    }
}

class Queue {
    static ArrayList<Long> arr = new ArrayList<>();

    public void push(long num) {
        arr.add(num);
    }

    public long front() {
        if(arr.size() < 1) return -1;
        return arr.get(0);
    }

    public long back() {
        if(arr.size() < 1) return -1;
        return arr.get(arr.size()-1);
    }

    public long size() {
        return arr.size();
    }

    public long empty() {
        if(arr.size() > 0) return 0;
        else return 1;
    }

    public long pop() {
        if(arr.size() < 1) return -1;
        long temp = arr.get(0);
        arr.remove(0);
        return temp;
    }
}
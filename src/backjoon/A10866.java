package backjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Deque deque = new Deque();
        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "push_back" : deque.push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front" : deque.push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" : bw.write(deque.pop_front() + ""); bw.write("\n");
                    break;
                case "pop_back" : bw.write(deque.pop_back() + ""); bw.write("\n");
                    break;
                case "size" : bw.write(deque.size() + ""); bw.write("\n");
                    break;
                case "empty" : bw.write(deque.empty() + ""); bw.write("\n");
                    break;
                case "front" : bw.write(deque.front()+ ""); bw.write("\n");
                    break;
                case "back" : bw.write(deque.back()+ ""); bw.write("\n");
                    break;
            }

        }
        bw.close();
    }
}


class Deque {
    private LinkedList<Integer> list;

    public Deque() {
        list = new LinkedList<>();
    }

    public void push_front(int n) {
        if(empty() == 1) list.add(n);
        else list.addFirst(n);
    }

    public void push_back(int n) {
        if(empty() == 1) list.add(n);
        else list.addLast(n);
    }

    public int pop_front() {
        if(empty() == 1) return -1;
        int n = list.getFirst();
        list.remove(0);
        return n;
    }

    public int pop_back() {
        if(empty() == 1) return -1;
        int n = list.getLast();
        list.remove(list.size()-1);
        return n;
    }

    public int size() {
        return list.size();
    }

    public int empty() {
        if(list.size() ==0 ) return 1;
        else return 0;
    }

    public int front() {
        if(empty() == 1) return -1;
        else return list.getFirst();
    }

    public int back() {
        if(empty() == 1) return -1;
        else return list.getLast();
    }
}
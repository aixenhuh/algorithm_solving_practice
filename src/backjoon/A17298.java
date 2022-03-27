package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }

        System.out.println(sb.toString().trim());

    }
}


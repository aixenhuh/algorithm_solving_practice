package backjoon;

import java.io.*;

public class A10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        System.out.println(fn(val));
    }

    static int fn(int n) {
        if(n > 1)  return fn(n - 1) + fn(n- 2);
        if( n == 0) return 0;
        if( n == 1) return 1;
        return 0;
    }
}

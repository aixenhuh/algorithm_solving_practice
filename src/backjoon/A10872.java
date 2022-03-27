package backjoon;

import java.io.*;

public class A10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        System.out.println(fn(val));
    }

    static int fn(int n) {
        int sum = 0;
        if(n > 0) sum = n * fn(n-1);
        else sum = 1;
        return sum;
    }
}

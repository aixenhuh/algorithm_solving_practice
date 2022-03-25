package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i= 0; i < count; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(isPrime(a)) result++;
        }
        System.out.println(result);

    }

    static boolean isPrime(int n) {
        if( n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

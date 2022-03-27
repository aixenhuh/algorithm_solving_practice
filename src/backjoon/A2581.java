package backjoon;

import java.io.*;

public class A2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = b;
        for(int i = a; i <= b; i++) {
            if(isPrime(i)) {
                sum += i;
                if(min > i) min = i;
            }
        }

        if(sum == 0) System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

}

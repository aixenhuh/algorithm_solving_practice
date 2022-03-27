package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A6588 {
    public static void main(String[] argss) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {

            boolean check = false;

            long num = Long.parseLong(br.readLine());
            if(num == 0) return;

            for(long i = 3; i <= (num / 2); i++) {
                if(i % 2 != 0 && isSosu(i) && (num - i) % 2 != 0 && isSosu(num - i)) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    check = true;
                    break;
                }
            }

            if(!check) System.out.println("Goldbach's conjecture is wrong.");
        }
    }

    public static boolean isSosu(long n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
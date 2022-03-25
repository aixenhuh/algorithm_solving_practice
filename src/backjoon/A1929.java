package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1929 {
    public static void main(String[] argss) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b= Integer.parseInt(st.nextToken());

        if(a == 1 && b == 1) {
            System.out.println(0);
            return;
        }
        for(long i = a; i <= b; i++) {
            if(isSosu(i)) {
                if(i == 1) continue;
                System.out.println(i);
            }
        }
    }

    public static boolean isSosu(long a) {
        for(long i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) return false;
        }
        return true;

    }
}
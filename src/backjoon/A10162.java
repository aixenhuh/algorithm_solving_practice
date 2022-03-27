package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10162 {

    static int A = 300;
    static int B = 60;
    static int C = 10;
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] result = new int[3];

        while(count > 9) {
            if(count / A > 0) {
                result[0] = count / A;
                count = count % A;
            } else if(count / B > 0) {
                result[1] = count / B;
                count = count % B;
            } else if (count / C > 0) {
                result[2] = count / C;
                count = count % C;
            }
        }

        if(count > 0) System.out.println(-1);
        else {
            for(int i : result) {
                System.out.print(i + " ");
            }
        }
    }
}
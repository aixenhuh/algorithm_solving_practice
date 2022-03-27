package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A11655 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();

        for(int i = 0; i < ch.length; i++) {
            int num = (int) ch[i];
            if(num >= 65 && num <= 90) {
                int temp = num - 65 - 13;
                if(temp < 0) System.out.print((char) (26 + 65 + temp));
                else System.out.print((char) (temp + 65));
            } else if(num >= 97 && num <= 122) {
                int temp = num - 97 - 13;
                if(temp <0) System.out.print((char) (26 + 97 + temp));
                else System.out.print((char) (temp + 97));
            } else if(num == 32) {
                System.out.print(" ");
            } else {
                System.out.print(ch[i]);
            }
        }
    }
}

package backjoon;

import java.io.IOException;
import java.util.Scanner;

public class A10820 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int[] result = new int[4];
            char[] ch = sc.nextLine().toCharArray();

            for(int i = 0; i < ch.length; i++) {
                if(65 <= (int) ch[i] && (int) ch[i] <= 90) {
                    result[1]++;
                } else if (97 <= (int) ch[i] && (int) ch[i] <= 122) {
                    result[0]++;
                } else if (48 <= (int) ch[i] && 57 >= (int) ch[i]) {
                    result[2]++;
                } else {
                    result[3]++;
                }
            }

            for(int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();

        }



    }
}

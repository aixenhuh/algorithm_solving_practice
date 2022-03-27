package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A9093 {

    public static void main(String[] argss) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++) {

            String[] temp = br.readLine().split(" ");
            String answer = "";
            for(int j = 0; j < temp.length; j++) {
                answer += new StringBuilder(temp[j]).reverse();
                answer += " ";
            }

            System.out.println(answer);
        }
    }
}
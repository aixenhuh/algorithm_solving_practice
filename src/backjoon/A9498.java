package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        String result = "";

        switch(a / 10) {
            case 10 :
                result = "A";
                break;
            case 9 :
                result = "A";
                break;
            case 8:
                result = "B";
                break;
            case 7:
                result = "C";
                break;
            case 6:
                result = "D";
                break;
            default:
                result = "F";
                break;
        }

        System.out.println(result);
    }
}

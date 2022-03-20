package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1008 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer( br.readLine());
        double a = Integer.parseInt(st.nextToken()) * 1.0;
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a / b);
    }
}

package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class A10824 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split( " ");
        System.out.println(Long.parseLong(str[0] + str[1]) + Long.parseLong(str[2] + str[3]));
    }
}

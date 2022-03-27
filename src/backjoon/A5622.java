package backjoon;

import java.io.*;

public class A5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        String[] alphabet = new String[]{"ABC", "DEF", "GHI", "JKL", "MNO","PQRS", "TUV", "WXYZ"};
        int result = 0;
        for(char a : arr) {
            for(int i = 0; i < alphabet.length; i++) {
                if(alphabet[i].indexOf(a) > -1) result += i + 3;
            }
        }
        System.out.println(result);
    }
}

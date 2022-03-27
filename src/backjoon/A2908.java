package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        String[] result = new String[st.countTokens()];
        while(st.hasMoreTokens()){
            char[] arr = st.nextToken().toCharArray();
            char[] reverseArr = new char[arr.length];
            String copy = "";
            for (int i = arr.length - 1; i >= 0; i--) {
                reverseArr[arr.length - i - 1] = arr[i];
                copy += "" + String.valueOf(reverseArr[arr.length - i - 1]);
            }
            result[count] = copy;
            count ++;
        }

        Collections.sort(Arrays.asList(result), Comparator.reverseOrder());

        System.out.println(result[0]);

    }

}


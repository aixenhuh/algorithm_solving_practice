package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String result = "";

        for(int i = 0; i < count; i++) {
            result = "";
            StringTokenizer st = new StringTokenizer(br.readLine());
            int duplicate = Integer.parseInt(st.nextToken());
            char[] val = st.nextToken().toCharArray();
            for(int k = 0; k <val.length; k++) {
                for(int j = 0; j < duplicate; j++) {
                    result += String.valueOf(val[k]);
                }
            }

            System.out.println(result);
        }

    }

}


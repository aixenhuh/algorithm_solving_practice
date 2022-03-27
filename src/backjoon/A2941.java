package backjoon;

import java.io.*;

public class A2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        String[] alphabet = new String[]{"c=", "c-", "dz=", "d-", "lj","nj", "s=", "z="};
        int count = 0;
        String common = "";
        String copyVal = "";

        while(val.length() > 0) {
            int min = 100;
            for (int i = 0; i < alphabet.length; i++) {
                int start = val.indexOf(alphabet[i]);
                if(start > -1 && start < min) {
                    common = alphabet[i];
                    min = start;
                }
            }

            if(min == 100) {
                break;
            }
            copyVal = val.substring(0, min);
            val = val.substring(min + common.length());
            copyVal = copyVal.replace(common, "");
            count = count + copyVal.length() + 1;
        }

        count = count + val.length();

        System.out.println(count);
    }
}

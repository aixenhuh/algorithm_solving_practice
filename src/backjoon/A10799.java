package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        int max = Math.max(a.length(), b.length());

        int[] arr = new int[max+1];
        int[] arr1 = new int[max+1];

        for(int i = a.length() - 1; i >= 0; i--) {
            arr[a.length() - i -1] = a.toCharArray()[i] -'0';
        }

        for(int i = b.length() - 1; i >= 0; i--) {
            arr1[b.length() - i -1 ] = b.toCharArray()[i] -'0';
        }

        for(int i = 0; i < max; i++) {
            int sum = arr[i] + arr1[i];
            arr[i] = sum % 10;
            arr[i+1] = arr[i+1] + sum / 10;
        }

        for(int i = max; i >=0; i--) {
            if(i == max && arr[i] == 0) continue;
            System.out.print(arr[i]);

        }






    }
}

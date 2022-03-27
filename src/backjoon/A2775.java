package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[][] arr = new int[15][14];

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 14; j++) {
                if(j == 0) arr[i][j] = 1;
                else if(i == 0) {
                    arr[0][j] = j + 1;
                }
                if( i > 0 && j > 0) {
                    arr[i][j] = arr[i][j-1] + arr[i-1][j];
                }
            }
        }

        for(int i = 0; i < count; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[k][n-1]);
        }
    }
}

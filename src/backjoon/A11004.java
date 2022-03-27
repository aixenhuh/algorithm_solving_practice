package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11004 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());
        int[] array = new int[count];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for(int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(array);

        System.out.println(array[idx-1]);
    }

    public static void mergeSort(int[] array, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;

            mergeSort(array, start, mid);
            mergeSort(array,mid+1, end);

            int[] temp = new int[array.length];

            int p = start;
            int q = mid + 1;
            int idx = p;

            while(p <= mid || q <= end) {
                if(q > end || (p <= mid && array[p] < array[q])) {
                    temp[idx++] = array[p++];
                } else {
                    temp[idx++] = array[q++];
                }
            }

            for(int i = start; i <= end; i++) {
                array[i] = temp[i];
            }
        }
    }
}

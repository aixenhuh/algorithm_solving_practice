package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class A1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 1; i <= count; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        int size = 0;
        while(arr.size() > 0) {
            try {
                int temp = arr.get(0);
                if (result.size() == 0) {
                    result.add(++size);
                    sb.append("+").append('\n');
                }
                if ((result.get(result.size() - 1)).compareTo(temp) != 0) {
                    if(result.size() > arr.size()) {
                        System.out.println("NO");
                        return;
                    }
                    result.add(++size);
                    sb.append("+").append('\n');
                } else {
                    sb.append("-").append('\n');
                    result.remove(result.size() - 1);
                    arr.remove(0);
                }
            } catch (Exception e) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);

    }
}

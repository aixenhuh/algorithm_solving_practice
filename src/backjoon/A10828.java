package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A10828 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String git = st.nextToken();
            if("push".equals(git)) {
                arr.add(Integer.parseInt(st.nextToken()));
            } else if("size".equals(git)) {
                System.out.println(arr.size());
            } else if("empty".equals(git)) {
                if(arr.size() < 1) System.out.println(1);
                else System.out.println(0);
            } else if("pop".equals(git)) {
                if(arr.size() < 1) System.out.println(-1);
                else {
                    System.out.println(arr.get(arr.size()-1));
                    arr.remove(arr.size()-1);
                }
            } else if("top".equals(git)) {
                if(arr.size() < 1) System.out.println(-1);
                else {
                    System.out.println(arr.get(arr.size()-1));
                }
            }
        }
    }
}
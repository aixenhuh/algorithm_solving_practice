package backjoon;

import java.util.*;

public class A2217 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> sum = new ArrayList<Integer>();

        for (int i = 0; i < count; i++) {
            arr.add(in.nextInt());
        }

        Collections.sort(arr);

        for (int i = 0; i < count; i++) {
            sum.add(arr.get(i) * (count - i) );
        }

        Collections.sort(sum, Collections.reverseOrder());

        System.out.println(sum.get(0));
    }
}

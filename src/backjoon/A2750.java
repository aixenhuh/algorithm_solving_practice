package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class A2750 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        int count = Integer.parseInt(br.readLine());


        for(int i = 0; i < count; i++) arr.add(Integer.parseInt(br.readLine()));

        Collections.sort(arr);

        for(int i : arr) {
            System.out.println(i);
        }

    }
}
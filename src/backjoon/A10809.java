package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int i = 0; i <arr.length; i++) {
            hm.put(arr[i], -1);
        }
        int i = 0;
        for(char a : str.toCharArray()) {
            if(hm.get(a) == -1) {
                hm.put(a, i);
            }
            i++;
        }


        Set<Character> a = hm.keySet();

        Iterator<Character> c = a.iterator();

        while(c.hasNext()) {
            System.out.print(hm.get(c.next()) + " ");
        }
    }
}



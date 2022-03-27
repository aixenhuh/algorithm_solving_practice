package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10814 {
    static Member[] memberList = null;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        memberList = new Member[count];
        int[] age = new int[201];

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            memberList[i] = new Member(tmp, st.nextToken(), ++age[tmp]);
        }

        quickSort(memberList, 0, memberList.length-1);

        for(int i = 0; i < count; i++ ){
            System.out.println(memberList[count - i - 1].getAge() + " " + memberList[count - i - 1].getName());
        }
    }

    public static int partition(Member[] array, int start, int end){
        Member pivot = array[(start+end)/2];
        while(start <= end) {
            while(pivot.sort(array[start])) start++;
            while(array[end].sort(pivot)) end--;

            if(start <= end) {
                Member temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }

    public static void quickSort(Member[] array, int start, int end) {

        if(start >= end) return;

        int p = partition(array, start, end);

        quickSort(array, start, p-1);
        quickSort(array, p, end);
    }
}

class Member {
    String name;
    int age;
    int ord;

    public Member(int age, String name, int ord) {
        this.age = age;
        this.name = name;
        this.ord = ord;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public int getOrd() {
        return this.ord;
    }

    public boolean sort(Member a) {
        if(this.age < a.age) {
            return true;
        } else if (this.age == a.age) {
            if(this.ord < a.ord) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

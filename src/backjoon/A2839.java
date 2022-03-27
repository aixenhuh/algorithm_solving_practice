package backjoon;

import java.util.Scanner;
public class A2839 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int numbers = in.nextInt();
                int cnt = 0;

                while(true) {
                        if (numbers % 5 ==0) {
                                System.out.println(numbers/5 + cnt);
                                break;
                        }else if(numbers <= 0) {
                                System.out.println(-1);
                                break;
                        }
                        numbers = numbers-3;
                        cnt++;
                }
        }
}
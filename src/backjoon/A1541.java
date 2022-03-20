package backjoon;

import java.util.*;

import static java.lang.Integer.*;

public class A1541 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String math = in.next();
        int sum = 0;

        while(true) {
            if(math.lastIndexOf('-') > -1) {
                if(math.lastIndexOf('-') > math.lastIndexOf('+')) {
                    sum += -1 * parseInt(math.substring(math.lastIndexOf('-') + 1));
                    math = math.substring(0, math.lastIndexOf('-'));
                } else if (math.lastIndexOf('-') < math.lastIndexOf('+')) {
                    sum += -1 * parseInt(math.substring(math.lastIndexOf('+') + 1));
                    math = math.substring(0, math.lastIndexOf('+'));
                }
            } else {

                if(math.lastIndexOf('+') > -1) {
                    sum += parseInt(math.substring(math.lastIndexOf('+') + 1));
                    math = math.substring(0, math.lastIndexOf('+'));
                }
            }
            if(math.lastIndexOf('-') < 0 && math.lastIndexOf('+') <0 ) {
                sum += parseInt(math);
                break;
            }
        }
        //55+50-40+10+10
        System.out.println(sum);
    }
}
import java.util.LinkedList;
import java.util.Queue;

class Main {

    public static void main(String[] args) {
        solution(8, 4, 7);
    }

    public static int solution(int n, int a, int b)
    {
        int round = 0;
        while(a != b)
        {
            a = a/2 + a%2;
            b = b/2 + b%2;
            round++;
        }
        return round;
    }

    public static String recursive(String str) {
        if("".equals(str)) return "";
        String[] uv = makeUV(str);
        if(isFine(uv[0]) && isAlright(uv[0])) {
            return uv[0] + recursive(uv[1]);
        } else {
            String newV = "(" +  recursive(uv[1]) + ")";
            String[] s = uv[0].split("");
            String newU = "";
            for(int i = 1; i < s.length-1; i++) {
                if("(".equals(s[i])) {
                    newU += ")";
                } else {
                    newU += "(";
                }
            }
            return newV + newU;
        }
    }

    public static String[] makeUV(String str) {
        String[] split = str.split("");
        String ans = "";
        String[] result = new String[2];
        for(int i = 0; i < split.length; i++) {
            ans += split[i];
            if(isFine(ans)) {
                result[0] = ans;
                result[1] = str.substring(i+1);
                return result;
            }
        }
        return result;
    }

    public static boolean isFine(String str) {
        int i = 0;
        if("".equals(str)) return false;
        String[] arr = str.split("");
        for(String one : arr) {
            if("(".equals(one)) i++;
            else i--;
            if(i==0) return true;
        }
        return false;
    }

    public static boolean isAlright(String str) {
        int i = 0;
        String[] arr = str.split("");
        for(String one : arr) {
            if("(".equals(one)) i++;
            else i--;
            if( i < 0) return false;
        }
        return true;
    }
}
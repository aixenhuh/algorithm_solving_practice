import java.io.*;

public class A1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        int a = Integer.valueOf(first);
        int result = 0;
        int count = 0;

        while( count == 0 || first != a ) {
            result = (a % 10) + ( a / 10);
            a = Integer.parseInt(String.valueOf(a % 10) + String.valueOf(result %10));
            count++;
        }
        System.out.println(count);
    }
}

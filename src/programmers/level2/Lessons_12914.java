package programmers.level2;


    public class Lessons_12914 {

        public static void main(String[] args) {

        }

        public long solution(int n) {
            long[] fun = new long[n];

            if (n == 1) return 1;
            if (n == 2) return 2;

            fun[0] = 1;
            fun[1] = 2;

            for (int i = 2; i < n; i++) {
                fun[i] = (fun[i - 1] + fun[i - 2]) % 1234567;
            }

            return fun[n - 1];
        }
    }

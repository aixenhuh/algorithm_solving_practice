package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11650 {
    static Point[] pointList = null;
    static Point[] tempList = null;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(br.readLine());
        pointList = new Point[count];
        tempList = new Point[count];

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pointList[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        mergeSort(0, count-1);


        for(int i = 0; i < count; i++) {
            System.out.println(pointList[i].getX() + " " + pointList[i].getY());
        }


    }

    static void mergeSort(int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p <= mid || q <=end) {
                if(q > end || p <= mid && pointList[q].sort(pointList[p])) {
                    tempList[idx++] = pointList[p++];
                } else {
                    tempList[idx++] = pointList[q++];
                }
            }

            for(int i = start; i<=end; i++) {
                pointList[i] = tempList[i];
            }
        }
    }
}


class Point {
    long x;
    long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return this.x;
    }

    public long getY() {
        return this.y;
    }

    public Boolean sort(Point b) {
        if(this.x > b.x) {
            return true;
        } else if (this.x == b.x) {
            if(this.y > b.y) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

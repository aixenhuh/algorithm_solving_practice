package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A11651 {
    static Points[] pointList = null;
    static Points[] tempList = null;
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        pointList = new Points[count];
        tempList = new Points[count];

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pointList[i] = new Points(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        mergeSort(0, pointList.length-1);

        for(int i = 0; i < pointList.length; i++) {
            System.out.println(pointList[i].getX() + " " + pointList[i].getY());
        }

    }

    public static void mergeSort(int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;

            mergeSort(start, mid);
            mergeSort(mid+1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while(p <= mid || q <= end) {
                if(q > end || (p <= mid && pointList[q].compare(pointList[p]))) {
                    tempList[idx++] = pointList[p++];
                } else {
                    tempList[idx++] = pointList[q++];
                }
            }
            for(int i = start; i <= end; i++) {
                pointList[i] = tempList[i];
            }
        }
    }

}

class Points {
    private int x;
    private int y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean compare(Points a) {
        if(this.y > a.y) {
            return true;
        } else {
            if(this.y == a.y) {
                if(this.x > a.x) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}

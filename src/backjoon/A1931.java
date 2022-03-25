package backjoon;

import java.util.*;

public class A1931 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Meeting> arr = new ArrayList<Meeting>();

        for(int i = 0; i < size; i++) {
            arr.add(new Meeting(in.nextInt(), in.nextInt()));
        }

        Collections.sort(arr);

        int count = 0;
        int end = 0;

        for(Meeting i : arr) {
            if(end <= i.getStartTime()) {
                count++;
                end = i.getEndTime();
            }
        }

        System.out.println(count);
    }
}

class Meeting implements Comparable<Meeting> {
    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    int getStartTime() {
        return this.startTime;
    }

    int getEndTime() {
        return this.endTime;
    }

    @Override
    public int compareTo(Meeting o1) {
        if(this.endTime > o1.endTime) {
            return 1;
        } else if (this.endTime == o1.endTime){
            if(this.startTime > o1.startTime) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}


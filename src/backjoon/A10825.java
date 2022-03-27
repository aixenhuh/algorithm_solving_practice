package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A10825 {

    static Student[] studentList = null;
    static Student[] tempList = null;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        studentList = new Student[count];
        tempList = new Student[count];

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            studentList[i] = new Student(name, korean, english, math);
        }

        mergeSort(0, studentList.length-1);

        for(int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getName());
        }

    }

    public static void mergeSort(int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;

            mergeSort(start, mid);
            mergeSort(mid+1, end);

            int p = start;
            int q = mid+1;
            int idx = p;

            while(p <= mid || q <= end) {
                if(q > end || (p <= mid && studentList[q].sort(studentList[p]))) {
                    tempList[idx++] = studentList[p++];
                } else {
                    tempList[idx++] = studentList[q++];
                }
            }

            for(int i = start; i <= end; i++) {
                studentList[i] = tempList[i];
            }
        }
    }
}

class Student {
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return this.name;
    }

    public boolean sort(Student a) {
        if(this.korean < a.korean) {
            return true;
        } else {
            if(this.korean == a.korean) {
                if(this.english > a.english) {
                    return true;
                } else {
                    if(this.english == a.english) {
                        if(this.math < a.math) {
                            return true;
                        } else {
                            if(this.math == a.math) {
                                if(this.name.compareTo(a.name) > 0) {
                                    return true;
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
    }
}
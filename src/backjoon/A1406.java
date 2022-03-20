package backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class A1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        Editor editor = new Editor(s);

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "P" :
                    editor.P(st.nextToken());
                    break;
                case "L"  :
                    editor.L();
                    break;
                case "B" :
                    editor.B();
                    break;
                case "D" :
                    editor.D();
                    break;
                default :
                    break;
            }
        }

        LinkedList<String> result = editor.getContent();

        for(String i : result) {
            bw.write(i);
        }

        bw.close();
    }
}

class Editor {
    private LinkedList<String> content;
    private ListIterator index;

    public Editor(String str) {
        this.content = new LinkedList<>(Arrays.asList(str.split("")));
        index = content.listIterator(content.size());
    }

    public void L() {
        if(!this.index.hasPrevious()) return;
        this.index.previous();
    }

    public void D() {
        if(!this.index.hasNext()) return;
        this.index.next();
    }

    public void B() {
        if(!this.index.hasPrevious()) return;
        this.index.previous();
        this.index.remove();
    }

    public void P(String input) {
        this.index.add(input);
    }

    public LinkedList<String> getContent() {
        return this.content;
    }
}
package PracticeFive;
import java.util.*;
import java.io.*;

public class TokenizerDemo {
    public static void main(String[] args) throws IOException {
//        String data = "name=Vijay address=delhi country=india dept=cse";

        FileInputStream fis = new FileInputStream("/Users/niles/OneDrive/Desktop/01-Java-Core/JavaCorePractice/02-Collection/student.txt");
        byte b[]= new byte[fis.available()];
        fis.read(b);

        String data = new String(b);
        StringTokenizer stk = new StringTokenizer(data.toString(),",");

        String s;
        ArrayList<Integer> al = new ArrayList<>();
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(Integer.valueOf(s));
        }

        System.out.println(al);
    }
}

package PracticeFive;
import java.util.*;
import java.io.*;
public class PropertyDemo {
    public static void main(String[] args) throws Exception{

        Properties p = new Properties();

//        p.setProperty("Brand","Dell");
//        p.setProperty("Processor","i7");
//        p.setProperty("OS","Windows10");
//        p.setProperty("Model","Latitude");

//        p.store(new FileOutputStream("/Users/niles/OneDrive/Desktop/01-Java-Core/JavaCorePractice/02-Collection/MyData.txt"),"Laptop");
//        p.storeToXML(new FileOutputStream("/Users/niles/OneDrive/Desktop/01-Java-Core/JavaCorePractice/02-Collection/MyData.xml"),"Laptop");

          p.load(new FileInputStream("/Users/niles/OneDrive/Desktop/01-Java-Core/JavaCorePractice/02-Collection/MyData.txt"));

        System.out.println(p);

    }
}

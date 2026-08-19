package Package;
import java.io.*;
public class Main{
    static void main(String[] args) throws Exception{
        File file = new File("practice.txt");
       file.createNewFile();

       FileWriter filewriter = new FileWriter("practice.txt");

       String str = "Hello this is my file";
       filewriter.write(str);

       filewriter.close();

       FileReader filereader = new FileReader("practice.txt");

       filereader.close();
    }
}

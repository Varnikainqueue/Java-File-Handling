package Package;
import java.io.*;
public class Main2{
   static void main(String[] args) throws Exception{
      File file = new File("practice.txt");
      file.createNewFile();

       FileWriter filewriter = new FileWriter("practice.txt");

       String str = "Hello this is my file";
       filewriter.write(str);

       filewriter.close();

      FileReader filereader = new FileReader("practice.txt");
       int data;

       while((data = filereader.read())!= -1){
           System.out.println((char) data);
       }

       filereader.close();

       file.delete();
    }
}

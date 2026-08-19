package Package;
import java.io.*;
class Student implements Serializable{
   int roll;
   String name;

   Student(int roll, String name){
       this.roll = roll;
       this.name = name;
   }
   void display(){
       System.out.println("roll no: " + roll);
       System.out.println("name: " + name);
   }
}
class Main1{
   public static void main(String[] args) throws Exception{
       Student stu = new Student(10, "xyz");
       stu.display();

       FileOutputStream fos = new FileOutputStream("Students.ser");
       ObjectOutputStream ous = new ObjectOutputStream(fos);
       ous.writeObject(stu);
       ous.close();

       FileInputStream fis = new FileInputStream("students.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);

       Student st1 = (Student)ois.readObject();
       st1.display();

       ois.close();
   }
}
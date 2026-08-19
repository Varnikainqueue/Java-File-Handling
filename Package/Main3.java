package Package;
import java.io.*;
class Vehicle implements Serializable{
   int num;
   String color;
   public Vehicle(int num, String color){
       this.num = num;
       this.color = color;
   }
   void display(){
       System.out.println(num);
       System.out.println(color);
   }
}
class Main3{
   static void main(String[] args) throws Exception{
       Vehicle vh = new Vehicle(101, "black");
       vh.display();

       FileOutputStream fos = new FileOutputStream("Students.ser");
      ObjectOutputStream ous = new ObjectOutputStream(fos);
       ous.writeObject(vh);
       ous.close();
   }
}
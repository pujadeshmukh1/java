package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Main {
public static void main(String[] args) throws Exception{
A a1=new A();
a1.i=22; //change the state of a1 object
FileOutputStream fos=new FileOutputStream("file1.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(a1);
oos.writeObject("Welcome");//String class object
oos.writeObject(10); //autoboxing
oos.close();
System.out.println("a1 object is serailized");
}
}
package Deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Serialization.A;

public class Demo {



	public static void main(String[] args) throws Exception{
		A a1=new A();
		a1.i=22;
		FileOutputStream fos=new FileOutputStream("d://file1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(a1);
		System.out.println("done");
	}
}
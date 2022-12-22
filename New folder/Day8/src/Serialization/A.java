package Serialization;

import java.io.Serializable;

public class A  implements Serializable
{
public int i=10;
public void funA(){
System.out.println("inside funA() of A");
System.out.println(i);
}
}


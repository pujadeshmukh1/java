package Fileclass;

import java.io.FileReader;
import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException {
FileReader fr=new FileReader("d://abcd.txt");
int i=fr.read();
while( i != -1) {     
System.out.print((char) i);
i = fr.read();
}
}
}
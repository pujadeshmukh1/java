package ha;


	import java.io.*;
	import java.util.*;

	public class que3 {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        String bag="";
	        for(int i=A.length()-1; i>=0; i--){
	            bag+=A.charAt(i);
	        }if(bag.equals(A)){
	            System.out.println("Yes");
	        }else{
	             System.out.println("No");
	        }
	    }
	}





//
//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
//
//Given a string , print Yes if it is a palindrome, print No otherwise.
//
//Constraints
//
// will consist at most  lower case english letters.
//Sample Input
//
//madam
//Sample Output
//
//Yes
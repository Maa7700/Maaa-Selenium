package Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		///Scanner sc=new Scanner()
		
		int num=1234;
		 StringBuilder str=new StringBuilder();
		 str.append(num);
		 StringBuilder reverse=str.reverse();
		 
		 System.out.println("Reverse Number is "+reverse);
		

	}

}

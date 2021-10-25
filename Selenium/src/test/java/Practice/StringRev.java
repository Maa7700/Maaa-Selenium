package Practice;

public class StringRev {

	public static void main(String[] args) {
		String input="Maaa";
		String Output="";
		
		for(int i=input.length()-1;i>0;i--)
		{
			Output=Output+input.charAt(i);
			System.out.println(Output);
		}

	}

}


///Notes
 /*To reverse a string as per customize way need to follow below steps.
  * 
  * First we calculate the length of the string then we put in loop so that it iterate as per condition and then based on charat method it take caharacter and print the state in reverse way.
  * We define length-1 because it fetch as per indexing start from o way.
  * 
  * 
  * */
  




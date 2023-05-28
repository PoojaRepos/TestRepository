package program;

/*
 * Reverse the word
 */
public class ReverseString {
	public static void main(String[] args) {
	
	String str = "Automation";
    String rev= "";
	
	for(int i=str.length()-1;i>=0;i--) {
		rev= rev+str.charAt(i);
	}
   System.out.println("the reverse of the string is  : " + rev);
	}
}

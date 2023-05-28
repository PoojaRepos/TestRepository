package program;

/*
 * logic is same for reverse of single word and complete string with many words
 */
public class ReverseWordByWord {
	public static void main(String[] args) {
		
		String str = "I am going to market";
	    String rev= "";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
	   System.out.println("the reverse of the string is  : " + rev);
		
	
	
	
	//using inbuilt methods we have
	
	StringBuffer br = new StringBuffer(str);
	br.reverse();
	System.out.println("Reverse of the strig using the inbuilt methods :" + br);
	
	}
}

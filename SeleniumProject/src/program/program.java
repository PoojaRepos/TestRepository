
package program;
	public class program {

		public static void main(String[] args) {

			String  str = "Learn The Java Pooja.";
			int VowelCount =0,Wordscount =0, uppercaseCount=0;
			
			//count the words vowels,uppercase
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				
				switch(c) {
				case ' ':
				case '.':
					Wordscount++;
			 
				}
				switch(c) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'u':
					VowelCount++;	
				}
				if(c>=65 && c<=90) {
					uppercaseCount++;
				}
				
			}
			
			System.out.println("The count of the words is " + Wordscount);
			System.out.println("The count of the Vowels is " + VowelCount);
			System.out.println("The count of the uppercase is " + uppercaseCount);
			
		}

	}


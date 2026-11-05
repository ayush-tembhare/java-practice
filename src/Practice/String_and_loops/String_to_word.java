package Practice.String_and_loops;

public class String_to_word {
	public static void main(String[] args) {
		String s1="i love india";
		String word="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				word.substring(0, 1).toUpperCase();
				System.out.println(word);
				word="";
			}
			else {
				
				word=word+s1.charAt(i);
				
			}
		}
		word.substring(0, 1).toUpperCase();
		
		System.out.println(word);
	}

}

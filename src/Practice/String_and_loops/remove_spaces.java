package Practice.String_and_loops;

public class remove_spaces {
	public static void main(String[] args) {
		String s1="i love india";
		//s1=s1.replaceAll("\\s", "");
		//System.out.println(s1);
		
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}

package Practice.loops;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string 1 ");
		String s1=sc.nextLine();
		System.out.println("Enter string 2 ");
		String s2=sc.nextLine();
		sc.close(); 
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length()) {
			char[] c1 =s1.toCharArray();
			char[] c2= s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1,c2)) {
				System.out.println("anagrams");
			}else {
				System.out.println("not an anagrams");
			}
		}
		else {
			System.out.println("not an anagrams");
		}
		
		
	}

}

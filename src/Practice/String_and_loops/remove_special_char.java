package Practice.String_and_loops;

public class remove_special_char {
    public static void main(String[] args) {
        String s = "h%e1@25l6%4%$l*o*";
        String result = ""; 
        String DigitStr="";
        int count = 0;   
        int numcount=0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
          if(Character.isDigit(ch)) {
        	  DigitStr+=ch;
        	  numcount++;
        	  
          }
            if (Character.isLetter(ch)) {
                result += ch; 
                   
            }else {
            	 count++;  
            }
        }
        
        System.out.println("Original String: " + s);
        System.out.println("Cleaned String: " + result);
        System.out.println("Total special char found: " + count);

        System.out.println("numbers String  :- "+DigitStr);
        System.out.println("Total number char  found: " + numcount);

    }
}

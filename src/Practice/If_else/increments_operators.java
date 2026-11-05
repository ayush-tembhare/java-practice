package Practice.If_else;

public class increments_operators {
	public static void main(String[] args) {
		int a=10;
		System.out.println("the 1st value of a is " +a);
		//postfix increment 
		System.out.println("the value of a just after postfix increment  is " +(a++));//postfix increment 
		System.out.println("now printed value of a without doing anything "+ a);
		
		//prefix increamnet 
		System.out.println("the value of a by using prefix increment is "+(++a));//prefix increment 
		
		System.out.println("");
		
		//for decrement 
		int b=10;
		System.out.println("the 1st value of b is " +b);
		//postfix decrement 
		System.out.println("the value of b just after postfix decrement  is " +(b--));//postfix decrement 
		System.out.println("now printed value of b without doing anything "+ b);
		
		//prefix decreamnet 
		System.out.println("the value of b by using prefix increment is "+(--b));//prefix decrement 
	}

}

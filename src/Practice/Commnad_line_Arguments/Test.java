package Practice.Commnad_line_Arguments;

public class Test {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		System.out.println("The square of "+num+" is "+square(num));
	}
	public static int square(int num) {
		return num*num;
	}
}

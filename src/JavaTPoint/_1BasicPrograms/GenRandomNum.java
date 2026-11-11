package JavaTPoint._1BasicPrograms;

import java.util.Random;

public class GenRandomNum {
	public static void main(String[] args) {
		double num =Math.random();
		int num2= (int)(Math.random()*10);
		System.out.println(num);
		System.out.println(num2);
		Random random = new Random();   
		int x = random.nextInt(10000);
		System.out.println(x);
		System.out.println("the sample 6 digit OTP is :- "+ random.nextInt(100000,1000000));
		System.out.println( random.nextDouble(1000000));
		System.out.println(random.nextFloat(1000000));
		int otp = 100000 + random.nextInt(900000);

		System.out.println("The sample 6 digit OTP is :- " + otp);
		
		
	}

}

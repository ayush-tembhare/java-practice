package Practice.loops;

public class spy_num {
	public static void main(String[] args) {
		int num=1124;
		int temp=num;
		int sum=0;
		int product=1;
		while(temp>0) {
			int last=temp%10;
			sum=sum+last;
			temp=temp/10;
		}
		System.out.println(sum);
		temp=num;
		while(temp>0) {
			int last=temp%10;
			product*=last;
			temp=temp/10;
		}
		System.out.println(product);
		if(sum==product) {
			System.out.println("spy");
		}
		else {
			System.out.println("not spy");
		}
	}

}

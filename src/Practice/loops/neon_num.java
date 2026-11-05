package Practice.loops;

public class neon_num {
	public static void main(String[] args) {
		int num=9;//0,1,9
		
		int numsq=num*num;
		int temp=numsq;
		System.out.println(temp);
		int sum=0;
		while(temp>0) {
			int last=temp%10;
			sum=sum+last;
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("neon");
		}
		else {
			System.out.println(" not neon");
		}
		
	}
}

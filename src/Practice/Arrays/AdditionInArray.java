package Practice.Arrays;

public class AdditionInArray {
	public static void main(String[] args) {
		int[] arr= {123,456,345,876};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			int num=arr[i];
			while(num >0) {
				int last=num%10;
				sum+=last;
				num=num/10;
			}
			if(sum%2==0) {
				System.out.print(sum+" ");
			}
		}
	}

}

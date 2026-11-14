package Practice.Arrays;

public class CountPostiveNegative {
	public static void main(String[] args) {
		int[] arr= {1,2,-3,0,-7,89,-85,0,0,0,95,-424};
		count(arr);
		
	}
	public static void count(int[] arr) {
		int pcount=0;
		int ncount=0;
		int zcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zcount++;
			}
			else if(arr[i]<0) {
				ncount++;
			}
			else if(arr[i]>0) {
				pcount++;
			}
		}
		System.out.println("Postive count is "+pcount );
		System.out.println("Negative count is "+ncount );
		System.out.println("Zero count is "+zcount );
	}

}

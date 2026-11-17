package JavaTPoint._3Array_Programs;

public class FrequencyOfElements {
	public static void main(String[] args) {
		int[] arr={1 ,   2,   8,  3,   2,   2,   2,   5,   1};
		int[] freq= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int fqcount=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					fqcount++;
				}
			}
			System.out.println("Freq of "+arr[i]+" is "+fqcount);
			
			}
	}

}

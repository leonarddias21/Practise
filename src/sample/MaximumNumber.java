package sample;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[]= {10,15,20,25,30};
			int max=a[0];
			for (int i=1;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			System.out.println("The max no is:"+max);
	}

}

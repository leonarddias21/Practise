package sample;

public class sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar= new int[]{12,45,56,78,100};
		//for(int i=0;i<ar.length;i++) {
			//System.out.println(ar[i]);
		//}
		
		int temp=0;
		for(int i=0;i<ar.length;i++) {
		for(int j=i;j<ar.length;j++) {
			if(ar[i]>ar[j]);{
			temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		

	}

}
for(int a:ar) {
	System.out.println(a);
}
	}
}
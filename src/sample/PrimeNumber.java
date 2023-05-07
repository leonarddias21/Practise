package sample;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=45;
			boolean flag=false;
			
			for( int i=2;i<=a/2;i++);
			{
				if(a%2==0);{
					flag=true;
				}
				
			}
			if(!flag)
				System.out.println(a + "is a prime number");		
			else
			System.out.println(a +" is not a prime number");
	}

}

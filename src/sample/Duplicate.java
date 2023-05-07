package sample;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Malyalam";
		int total = str.length();
		int total_afteremove=str.replaceAll("a", "").length();
		System.out.println("The output is "+total_afteremove);
		int count=total-total_afteremove;
		//System.out.println("Number of count occurence:"+count);
		

	}

}

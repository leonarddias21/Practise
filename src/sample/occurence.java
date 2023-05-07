package sample;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is java";
		int length=str.length();
		int total_remove=str.replaceAll("a", "").length();
		int total=length-total_remove;
		System.out.println(total);

	}

}

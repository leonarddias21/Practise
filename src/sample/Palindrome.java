package sample;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		String rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if (str.toLowerCase().equals(rev.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }

	}

}

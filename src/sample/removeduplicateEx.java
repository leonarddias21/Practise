package sample;

import java.util.HashSet;
import java.util.LinkedHashSet;

 public class removeduplicateEx {

	 static void removeduplicate(char str[],int n) {
		// TODO Auto-generated method stub
		HashSet<Character> s= new LinkedHashSet<>(n-1);
		for(char x:str)
			s.add(x);
		for(char x:s)
			System.out.print(x);

	}
	 
	 public static void main(String[] args) {
		 char str[] ="bangalore".toCharArray();
		 int n= str.length;
		 removeduplicate(str,n);
	 }
}



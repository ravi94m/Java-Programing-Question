import java.util.*;
class Reverse{
public static void main(String aa[]){
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	/*char c[]=s1.toCharArray();
	for(int i=c.length-1;i>=0;i--){
		System.out.print(c[i]);
	}*/
	String rev="";
	for(int i=s1.length()-1;i>=0;i--){
		rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
}
}
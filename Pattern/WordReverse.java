import java.util.Scanner;
class WordReverse{
	public static void main(String aa[]){
		String rever="";
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String arr[]=s1.split(" ");
		for(int i=0;i<arr.length;i++){
			String sr=reverse(arr[i]);
			rever=rever+sr+" ";
			
		}
		System.out.println(rever);
	}
	static String  reverse(String s){
	  String	rev="";
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
			
		}
		return rev;
	}
}
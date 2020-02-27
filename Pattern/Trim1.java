import java.util.*;
class Trim1{
	public static void main(String aa[]){
		Scanner sc =new Scanner(System.in);
		String s1=sc.nextLine();
		String str="";
		
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++){
		  if(ch[i]!=' '){
			  str=str+ch[i];
		  }
		  
		}
		System.out.println(str);
		
	}
}
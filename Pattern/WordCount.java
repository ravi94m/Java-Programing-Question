import java.util.*;
class WordCount{
	public static void main(String aa[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int i=0,count=0;
		while(i!=s1.length()-1){
			if(s1.charAt(i)==' '){
				count++;
			}
			i++;
		}
		System.out.println("number of word is "+count);
	}
	
}
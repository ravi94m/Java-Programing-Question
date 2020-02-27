import java.util.*;
class StringPalidrome{
	public static void main(String aa[]){
		int i=0,count=0;
		Scanner sc =new Scanner(System.in);
		String s1=sc.nextLine();
		char c1[]=s1.toCharArray();
		i=c1.length-1;
		int j=0;
		while(i>0){
			if(c1[i--]!=c1[j++]){
				count++;
			}
			/*i--;
			j++;*/
		}
		if(count>0){
			System.out.println("not palidrome");
		}
		else{
			System.out.println(" palidrome");
		}
	}

}
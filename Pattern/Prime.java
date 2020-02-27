import java.util.*;
class Prime{
	public static void main(String aa[]){
		int i=1,n,count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		n=sc.nextInt();
		/*while(i<=n){
			if(n%i==0){
				count++;
			}
			i++;
		}*/
	for(i=1;i<=n;i++){
		if(n%i==0){
				count++;
			}
		
	}
	if(count==2){
		System.out.println("Prime Number");
	}
	else{
		System.out.println("Not a Prime");
	}
	}
}
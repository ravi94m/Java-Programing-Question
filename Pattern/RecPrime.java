import java.util.*;
class RecPrime{
	static int i=1,count=-1;
	static int Prime(int n){
		
		if(n>0){
			
			if(n%i==0){
				count++;
			}
			i++;
			Prime(n-1);
			
			
			
		}
		
		
		return count;
	}
	public static void main(String aa[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		int count=Prime(n);
		if(count==2){
			System.out.println("Prime number");
		}
		else{
			System.out.println("not a prime number"+count);
		}
	}
}
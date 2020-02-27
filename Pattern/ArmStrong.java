import java.util.*;
class ArmStrong{
	public static void main(String aa[]){
		int r,sum=0,p;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		p=n;
		
		while(n!=0){
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;			
		}
		if(sum==p){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("Not armstrong numbber"+sum);
		}
	}
}
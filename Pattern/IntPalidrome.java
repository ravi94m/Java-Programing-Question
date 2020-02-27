import java.util.*;
class IntPalidrome{
	public static void main(String aa[]){
		int r=0,q=0,y=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		y=n;
		while(n!=0){
			r=n%10;
			q=q*10+r;
			n=n/10;
		}
		if(y==q){
			System.out.println("Palidrome");
		}
		else{
			System.out.println("Not Palidrome");
		}
		
	}
}
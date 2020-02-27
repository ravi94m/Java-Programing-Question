import java.util.*;
class RecFib{
	static int n1=0,n2=1,n3;
	static void Fib(int n){
		
		if(n>0){
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			Fib(n-1);
		}
	}
	public static void main(String aa[]){
		System.out.priintln("Please enter a number");
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Fib(n);
		
	}
}
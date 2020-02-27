import java.util.*;
class Fib{

public static void main(String aa[]){
	int n,i=0,n1=0,n2=1,n3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number");
	n=sc.nextInt();
	/*while(i<=8){
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		i++;
	}*/
	for( i=0;i<=n;i++){
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	
}
}
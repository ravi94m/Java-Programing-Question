import java.util.*;
class Fact{
public static void main(String aa[]){
	int i,fact=1;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(i=1;i<=n;i++){
		fact=fact*i;
		
	}
	/*for(i=n-1;i>0;i--)
	{
		n=n*i;
	}*/
	/*fact=n;
	i=n-1;
	while(i>0){
		fact=fact*i;
		i--;
	}
	System.out.println(fact);*/
	System.out.println(fact);
	
}
}
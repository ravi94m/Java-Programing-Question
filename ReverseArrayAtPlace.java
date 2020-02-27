import java.util.*;
class ReverseArrayAtPlace{
	public static void main(String aa[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int end=arr.length-1;
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element from where you want to rotate");
	int start=	sc.nextInt();
		for(int i=start;i<end;i++){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
	}
}
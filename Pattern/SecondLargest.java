import java.util.*;
class SecondLargest{
	public static void main(String aa[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements i the array");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int max2=arr[0];
		
			for(int j=0;j<arr.length;j++){
				if(arr[j]>max){
					max=arr[j];
				}
				
			}
			for(int j=0;j<arr.length;j++){
				if(arr[j]>max2 && arr[j]!=max){
					max2=arr[j];
				}
				
			}
		
		
		System.out.println("FIrst largest element "+max+"  "+"second largest element"+max2);
	}
}
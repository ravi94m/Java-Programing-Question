import java.util.*;
class RemoveDuplicate{
	public static void main(String aa[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size o the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		int k=0,j=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		/*Only Applicable for sorted array
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){ 
				arr1[k++]=arr[i];
			}
			if(i<arr.length){
				arr1[k]=arr[arr.length-1];
			}
		}
		*/
		int x=arr.length;
		for(int i=0;i<x;i++){
			for( j=i+1;j<x;j++){
				if(arr[i]==arr[j]){
					for(k=j;k<x-1;k++){
						arr[k]=arr[k+1];
						
					}
					x--;
					System.out.println(x);
					--j;
				}
				
			}
		}
		/*	
		for(int i=0;i<k+1;i++){
			System.out.println(arr1[i]);
		}*/
		for(int i=0;i<j;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
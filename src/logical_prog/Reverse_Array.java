package logical_prog;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		//arr= new int[] {1,2,3,4,5};
		
		System.out.println(" Reverse Array is");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+"  ");
		}

	}

}

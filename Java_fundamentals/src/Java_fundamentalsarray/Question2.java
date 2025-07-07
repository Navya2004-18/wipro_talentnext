package Java_fundamentalsarray;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int size=d.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter the elements of an array: ");
		for(int i=0;i<size;i++) {
			arr[i]=d.nextInt();
			
			
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum integer of the array:" +max);
		System.out.println("Minimum integer of the array:"+min);
		
		
     
	}

}
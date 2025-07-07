package Java_fundamentalsarray;
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner d=new Scanner(System.in);
     int size= d.nextInt();
     int[] arr=new int[size];
     System.out.println("Enter the elements of the array: ");
     for(int i=0;i<size;i++) {
    	 arr[i]=d.nextInt();
    	 }
     int n= d.nextInt();
     int index=-1;
     for(int i=0;i<size;i++) {
    	 if(arr[i]==n) {
    	 index=i;
    	 }
    	
     }
     if(index!=-1) {
    	 System.out.println("value found in the array where index is: "+index);
     }else {
    	 System.out.println(-1);
     }
     }
	

}
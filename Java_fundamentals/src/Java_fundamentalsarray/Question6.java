package Java_fundamentalsarray;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner d=new Scanner(System.in);
   int size =d.nextInt();
   int[] arr=new int[size];
   for(int i=0;i<size;i++) {
	   arr[i]=d.nextInt(); 
   }
   Arrays.sort(arr);
   System.out.print("Sorted array: ");
   for(int i=0;i<size;i++) {
	   System.out.print(arr[i]+" ");
   }
	}

}
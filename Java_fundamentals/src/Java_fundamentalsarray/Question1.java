package Java_fundamentalsarray;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner d =new Scanner(System.in);
     int size=d.nextInt();
     int[] arr=new int[size];
     int sum=0;
     System.out.println("enter elements of an array:");
     for(int i=0;i<size;i++) {
    	 arr[i]=d.nextInt();
    	 sum +=arr[i];
    	 
    	 }
     int avg = sum /size;
     System.out.println("sum of the elements:" +sum);
     System.out.println("Average of the elemts:" +avg);
     
     
	}

}
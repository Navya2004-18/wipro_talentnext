package Java_fundamentalsarray;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner d=new Scanner(System.in);
      int size=d.nextInt();
      int[] arr=new int[size];
      for(int i=0;i<size;i++) {
    	  arr[i]=d.nextInt();
      }
      int sum=0;
      int i=0;
      while(i<size) {
    	  if(arr[i]==6) {
    		  i++;
    		  while(i<size && arr[i]!=7) {
    			  i++;
    		  }
    		  i++;
    	  }else {
    		  sum+=arr[i];
    		  i++;
    	  }
    	  
      }
      System.out.print("Sum of the array excluding elements b/w 6 & 7 is: "+sum);
      
	}

}
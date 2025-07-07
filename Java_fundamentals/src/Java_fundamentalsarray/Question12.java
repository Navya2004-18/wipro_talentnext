package Java_fundamentalsarray;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner d=new Scanner(System.in);
      int[] arr=new int[3];
      int[] brr= new int[3];
      int[] result=new int[2];
      for(int i=0;i<3;i++) {
    	  arr[i]=d.nextInt();
    	  
      }
      for(int j=0;j<3;j++) {
    	  brr[j]=d.nextInt();
    	  
      }
      
    	  result[0]= arr[1];
    	  result[1]=brr[1];
      
      
      System.out.println(result[0]+" "+result[1]);
      
	}

}
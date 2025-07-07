package Java_fundamentalsarray;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner d=new Scanner(System.in);
        int size=d.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++) {
        	arr[i]=d.nextInt();
        }
        int count=0;
        for(int i=0;i<size;i++) {
        	if(arr[i]==1 || arr[i]==4) {
        		count=1;
        		break;
        		
        		
        	}
        }
        if(count==1) {
        	System.out.println(true);
        	
        }else {
        	System.out.println(false);
        }
        
        
	
	}

}
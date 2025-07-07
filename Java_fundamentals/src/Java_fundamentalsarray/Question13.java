package Java_fundamentalsarray;
import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int[] arr=new int[size];
    if(size==4) {
    	for(int i=0;i<size;i++) {
    		arr[i]=sc.nextInt();
    		
    	}
    	int[][] _2d=new int[2][2];
    	int k=0;
    	for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    			_2d[i][j]=arr[k];
    			k++;
    			
    		}
    	}
    	for(int i=0;i<2;i++) {
    		for(int j=0;j<2;j++) {
    			System.out.print(_2d[i][j]+" ");
    			
    		}
    		
    	System.out.println();
    	}
    	
    	 for(int i=1;i>=0;i--) {
    	for(int j=1;j>=0;j--) {
    		System.out.print(_2d[i][j]+" ");
    		
    	}
    	System.out.println();
    }
    }
	
    else {
    	 System.out.println("please enter 4 integer values");
     }
	}

}
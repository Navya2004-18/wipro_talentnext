package Java_fundamentalsarray;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner d= new Scanner(System.in);
    int size=d.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++) {
    	arr[i]=d.nextInt();
    }
    int l1,l2,s1,s2;
     if(arr[0]>arr[1]) {
    	 l1=arr[0];
    	 l2=arr[1];
    	 s1=arr[1];
    	 s2=arr[0];
     }else {
    	 l1=arr[1];
    	 l2=arr[0];
    	 s1=arr[0];
    	 s2=arr[1];
    	 
     }
     for(int i=2;i<size;i++) {
    	 if(arr[i]>l1) {
    		 l2=l1;
        	 l1=arr[i];
    	 }else if(arr[i]>l2){
    		 l2=arr[i];
    	 }
    	 if(arr[i]<s1) {
    		 s2=s1;
    		 s1=arr[i];
    		 
    	 }else if(arr[i]<s2) {
    		 s2=arr[i];
    		 
    	 }
    	 
     }
     System.out.println("Largest number: "+l1);
     System.out.println("Second Largest number: "+l2);
     System.out.println("Smallest number: "+s1);
     System.out.println("Second Smallest number: "+s2);
    		
   }
        
    	
    

    }
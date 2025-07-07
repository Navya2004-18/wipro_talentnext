package Java_fundamentalsarray;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int size=d.nextInt();
		int[] arr=new int[size];
		int[] result=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=d.nextInt();
		}
		int ind=0;
		
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
			   result[ind]=arr[i];
				ind++;
				
			}
		}
		for(int i=0;i<size;i++) {
			if(arr[i]%2 !=0) {
				result[ind]=arr[i];
              ind++;
		}
		

	}
		for(int i=0;i<size;i++) {
			System.out.print(result[i]+" ");
		}

}
}
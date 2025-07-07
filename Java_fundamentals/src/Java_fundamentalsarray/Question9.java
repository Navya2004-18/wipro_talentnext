package Java_fundamentalsarray;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int size=d.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=d.nextInt();
			
		}
		int ind=0;
		for(int i=0;i<size;i++) {
			if(arr[i]!=10) {
				arr[ind]=arr[i];
				ind++;
				
			}
		}while(ind<size) {
				arr[ind]=0;
				ind++;
			}
		
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
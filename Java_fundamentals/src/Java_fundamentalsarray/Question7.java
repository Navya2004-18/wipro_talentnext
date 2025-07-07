package Java_fundamentalsarray;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int size=d.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=d.nextInt();
		}
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
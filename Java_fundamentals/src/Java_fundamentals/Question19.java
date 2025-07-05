package Java_fundamentals;
import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int re=0;
		while(n!=0) {
			int d=n%10;
			re=re*10+d;
			n=n/10;
			
		}
		System.out.println(re);
	}

}
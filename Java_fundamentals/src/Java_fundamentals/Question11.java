package Java_fundamentals;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch=='R') {
			System.out.println("R->Red");
		}
		else if(ch=='B') {
			System.out.println("B->Blue");
		}
		else if(ch=='G') {
			System.out.println("G->Green");
		}
		else if(ch=='O') {
			System.out.println("O->Orange");
		}
		else if(ch=='Y') {
			System.out.println("Y->Yellow");
		}
		else if(ch=='W') {
			System.out.println("W->White");
		}
		else {
			System.out.println("Invalid Code");
		}
		
	}

}
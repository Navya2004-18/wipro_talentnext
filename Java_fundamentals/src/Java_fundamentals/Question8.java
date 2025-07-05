package Java_fundamentals;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println("Alphabet");
		}
		else if(ch>='0'&& ch<='9') {
			System.out.println("Number");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
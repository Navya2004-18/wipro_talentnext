package Java_fundamentalsarray;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		int size =d.nextInt();
		int[] arr=new int[size];
		if(size==9) {
			for(int i=0;i<size;i++) {
				arr[i]=d.nextInt();
				
			}
			int[][][]_3d=new int[3][1][3];
			int l=0;
			for(int i=0; i<3;i++) {
				for(int j=0;j<1;j++) {
					for(int k=0;k<3;k++) {
						_3d[i][j][k]=arr[l];
						l++;
					}
				}
			}
			for(int i=0;i<3;i++) {
				for(int j=0;j<1;j++) {
					for(int k=0;k<3;k++) {
						System.out.print(_3d[i][j][k]+" ");
					}
					System.out.println();
				}
			}
				int max=_3d[0][0][0];
				for(int i=0;i<3;i++) {
					for(int j=0;j<1;j++) {
						for(int k=0;k<3;k++) {
							if(_3d[i][j][k]>max) {
								max=_3d[i][j][k];
								
							}
						}
					}
				}
				System.out.print("The maximum value is: "+max);
				
			}
		else {
			System.out.println("Please enter 9 integer values");
		}
	}

}
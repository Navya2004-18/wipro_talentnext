package Java_oops;

import java.util.Scanner;

class Box{
	double width,height,depth;
	Box(double w,double h,double d){
		width=w;
		height =h;
		depth=d;
	}
	double getVolume() {
		return width*height*depth;
	}
}

public class Question1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter width: ");
		double width =sc.nextDouble();
		System.out.println("Enter height: ");
		double height= sc.nextDouble();
		System.out.println("Enter depth: ");
		double depth=sc.nextDouble();
		Box myBox=new Box(width,height,depth);
		double volume = myBox.getVolume();
		System.out.println("Volume of the box: " +volume);
	}

}

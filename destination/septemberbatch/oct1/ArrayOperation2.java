package destination.septemberbatch.oct1;

import java.util.Scanner;

class TwoDArray {
	int arr[][];
	int cls;
	int stu;
	void createArray(int n,int m) {
		cls=n;
		stu=m;
		arr = new int [cls][stu];
		System.out.println("array is create successfully");
		System.err.println("================");
	}
	void addData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Collecting array data");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside the class no:"+ (i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("enter the marks of student no : " + (j+1));
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Marks successfully Collected");
		System.out.println("=============");
	}
	void display() {
		System.out.println("display array data");
		for(int i=0;i<cls;i++) {
			System.out.println("inside the class no " + (i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The marks of student no "+(j+1) + "=" + arr[i][j]);
				
			}
		}
	}
}

public class ArrayOperation2 {
  public static void main(String[] args) {
	TwoDArray obj1 = new TwoDArray();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the class count");
	int n = scanner.nextInt();
	System.out.println("enter the student count");
	int m = scanner.nextInt();
	obj1.createArray(n, m);
	obj1.addData();
	obj1.display();
}
}
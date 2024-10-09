package destination.septemberbatch.oct1;

import java.util.Scanner;

class ArrayProgram2{
	int arr[][];
	int cls;
	Scanner sc = new Scanner(System.in);
  void createArray(int n) {
		cls = n;
		arr = new int [n][];
		System.out.println("collecting student count for each class: ");
		for(int i=0;i<arr.length;i++) {
			int stu = sc.nextInt();
			arr[i] = new int[stu];
		}
		System.out.println("array is created successfully");
		System.out.println("===============");
	}
	void addData() {

		System.out.println("Collecting the array data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class no:  "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the marks of student no : "+(j+1));
				arr[i][j] = sc.nextInt();
			}
			}
		System.out.println("Mark collected successfully");
		System.out.println("===============");
	}

	void display() {
		System.out.println("display array data:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class no:  "+(i+1));	
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the marks of student no : "+(j+1)+" is=  "+arr[i][j]);
		}
	}
  }
}
public class ArrayProgram3{
    public static void main(String[] args) {
		ArrayProgram2 ao3 = new ArrayProgram2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the class count : ");
		int cls = sc.nextInt();
		ao3.createArray(cls);
		ao3.addData();
		ao3.display();
	}
}
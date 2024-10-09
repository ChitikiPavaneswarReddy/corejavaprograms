package destination.septemberbatch.oct1;

import java.util.Scanner;

class ArrayOperation1{
	int arr[];
	int size;
	void createArray(int n) {
		size=n;
		arr = new int [size];
		System.out.println("Array is created successfully");
		System.out.println("===============");
	}
	void addData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Collecting the array data");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the marks of student no : "+ (i+1));
			arr[i]=scanner.nextInt();
		}
		System.out.println("Mark collected successfully");
	}
	void display() {
		for(int i=0;i<size;i++) {
			System.out.println("marks of student no"+ (i+1) + "=" + arr[i]);
		}
	}
}
public class ArrayDataStructure {
    public static void main(String[] args) {
		ArrayOperation1 obj1 = new ArrayOperation1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of student : ");
		int n = sc.nextInt();
		obj1.createArray(n);
		obj1.addData();
		obj1.display();
	}
}
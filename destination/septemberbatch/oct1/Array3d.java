package destination.septemberbatch.oct1;

import java.util.Scanner;

class ArrayProgram3{
	string arr[][][];
	int cls;
	int stu;
	int clg;
	Scanner sc = new Scanner(System.in);
	
  void createArray(int m,int n,int o) {
		arr= new String[m][n][o];
		System.out.println("array is created successfully");
		System.out.println("===============");
	}
	void addData() {

		System.out.println("Collecting the array data");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside college no:  "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no : "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the name of student no : "+(k+1)+"in class no"(j+1)+"is =");
				arr[i][j][k]= sc.next();
				}
			}
			}
		System.out.println("name successfully collected: ");
		System.out.println("===============");
	}

	void display() {
		System.out.println("display array data:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside college no:  "+(i+1));	
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no : "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the name of student no : "+(k+1)+"in class no"(j+1)+" is= "+arr[i][j][k]);	
				}
		}
	}
  }
}
public class Array3d{
    public static void main(String[] args) {
		ArrayProgram3 ao3 = new ArrayProgram3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the college count : ");
		int m = sc.nextInt();
		System.out.println("Enter the class count : ");
		int n = sc.nextInt();
		System.out.println("Enter the student count : ");
		int o = sc.nextInt();
		
		ao3.createArray(m,n,o);
		ao3.addData();
		ao3.display();
	}
}
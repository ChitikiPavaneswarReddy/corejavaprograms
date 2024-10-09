package destination.septemberbatch.oct1;

import java.util.Scanner;
class array3{
	String arr[][][];
	int col;
	int cls;
	int stu;
	void createArray(int n, int m,int o) {
		col=m;
		cls=n;
		stu=o;
		arr = new String[col][cls][stu];
		System.out.println("Array ia created succesfully");
		System.out.println("===============");
	}
	void addData(){
		System.out.println("collecting array Data:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the college no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student :"+(k+1)+"in class no"+(j+1)+"is =");
					arr[i][j][k]=sc.next();
					
				}
			}
		}
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
			
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student :"+(k+1)+"in class no"+(j+1)+"is ="+arr[i][j][k]);
					
					
				}
			}
		}
	}
}
public class Array3dcode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the clg count:");
		 int clg = sc.nextInt();
		 System.out.println("Enter the cls count:");
		 int cls = sc.nextInt();
		 System.out.println("Enter the stu count: ");
		 int stu = sc.nextInt();
		 array3 ao=new array3();
		 ao.createArray(clg, cls, stu);
		 ao.addData();
		 ao.displayData();
		 
	}
}
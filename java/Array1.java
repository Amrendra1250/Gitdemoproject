import java.util.Scanner;

Class Array1 {

	public static void main(String[] args) {
	Scanner SC=new Scanner(System.in);
	int age=SC.nextInt();
	int[] a= {10,20,30};
	//int[] a = new int[3];
	//a[0]=10;
	//a[1]=20;
	//a[2]=30;
	System.out.println(a[1]);
	System.out.println(a.length);
	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+",");
	}
System.out.println(a.length);
	}
}
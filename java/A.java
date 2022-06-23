import java.util.Scanner;
class A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age: ");
		int age=sc.nextInt();
		if(age<5)
		{
			System.out.println("Amrendra");
		}
		else
		{
			System.out.println("Sablu");
		}
	}
}
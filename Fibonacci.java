 import java.util.Scanner;
 class Fibonacci{
	
	public static void main(String[] args)
	{
		int prev=1;
		int curr=1;
		System.out.println("Enter the length of fibonacci :  ");
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		
		System.out.println("Fibonacci of first "+length+" numbers : ");
		System.out.println(prev);
		System.out.println(curr);
		for(int i=3; i<=length; i++)
		
		{
			int next=prev+curr;
			System.out.println(next);
			prev=curr;
			curr=next;
			
		}
			
	}
	
}

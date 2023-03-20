import java.util.Scanner;

public class SquareRoot {

	public static void main(String args[]) {
		
		int a, b, c, div;
		
	    double root1, root2;
	    
	    System.out.print("enter the value of a :  ");
	    Scanner input = new Scanner(System.in);
	    a=input.nextInt();
	    
	    System.out.println();
	    System.out.print("enter the value of b :  ");
	    input = new Scanner(System.in);
	    b=input.nextInt();
	    
	    System.out.println();
	    System.out.print("enter the value of c :  ");
	    input = new Scanner(System.in);
	    c=input.nextInt();
	    
	   
	    div=b*b-4*a*c;
	    
	    if(div>0){
	        root1 = -b + Math.sqrt(div)/ (2 * a);
	        root2 = -b - Math.sqrt(div)/ (2 * a);
	        System.out.println("root1= "+root1 +"\nRoot2=" +root2);
	    }
	    else if(div==0){
	        root1=root2= -b/(2*a);
	        System.out.println("root1=root2" +root1);
	    }
	    else{
	    	 System.out.println("roots are imaginary");
	    }
	    
	    
	    
	}
}
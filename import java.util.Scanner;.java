import java.util.Scanner;

class nums{
    int num1 , num2;
    public int display(int a , int b){
        num1=a;
        num2 =b;
        return a+b;
    }
}

class sub extends nums{
   public int display(int a , int b){
       num1 = a;
       num2 = b;
       return a-b;

    }
}

class mult extends nums{
    public int display(int a , int b){
        num1 =a;
        num2 =b;
        return a*b;

    }
}

public class mcq {
    public static void main(String[] args) {


        boolean loop = true;
        do {

            System.out.println("-----------------mathematical operations --------------------");
            System.out.println();
            System.out.println("Enter 1 to add two numbers:");
            System.out.println("enter 2 to subtract two numbers:");
            System.out.println("enter 3 to multiply two numbers:");
            System.out.println("enter 4 to exit");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            switch (x) {
                case 1:
                nums obj1 = new nums();
                    System.out.println("the sum is:");
                System.out.println(obj1.display(5, 6));
                break;

                case 2:
                sub obj2 = new sub();
                    System.out.println("result :");
                System.out.println(obj2.display(6, 5));
                break;

                case 3:
                mult obj3 = new mult();
                    System.out.println("the product is:");
                System.out.println(obj3.display(6, 5));
                break;

                case 4:
                loop = false;
                break;
            }

        } while(!loop);
    }
}
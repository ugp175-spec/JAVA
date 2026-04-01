import java.util.*;

public class condition1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("ADULT");
        }

        else{
            System.out.println("not adult");
        }

        System.out.println("enter the number");

        int number = sc.nextInt();

        if((number % 2) == 0)
        {
            System.out.println("the number is even\n");
        }

        else{
            System.out.println("the number is odd \n");
        }

        System.out.println("enter the number a");
        int a = sc.nextInt();
        System.out.println("enter the number b");
        int b = sc.nextInt();

        if(a == b)
        {
            System.out.println("the number is equle");
        }

        else if(a > b)
        {
            System.out.println("a is greter");
        }

        else
        {
            System.out.println("b is greter");
        }


        sc.close();
    }
    
}

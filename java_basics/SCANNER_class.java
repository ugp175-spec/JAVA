import java.util.*;

public class SCANNER_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = a+b;

        System.out.println("sum = "+sum);
        System.out.println("for an integer");
        System.out.println(Integer.SIZE);

        int d = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;

        System.out.println(d+"<--->"+e);



        sc.close();
    }
    
}

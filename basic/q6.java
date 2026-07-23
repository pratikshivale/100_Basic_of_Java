package basic;
import java.util.*;

public class q6 {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();

        System.out.print("Enter the number b :" );
        int b = sc.nextInt();

        System.out.println("Number before swap: ");
        System.out.println("a =" + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b ;
        b = temp;

        System.out.println("Number after swap:");
        System.out.println("a =" + a);
        System.out.println("b =" + b);



    }
    
}

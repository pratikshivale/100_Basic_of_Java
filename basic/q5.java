package basic;
import java.util.*;

public class q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Length : " );
        int length = sc.nextInt();

        System.out.println("Enter the value of width : " );
        int width = sc.nextInt();

        System.out.println("The Perimeter is : " + (2*(length + width)));
        System.out.println("The Area is : " + (length * width) ); 

    
}
}

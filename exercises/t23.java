package exercises;
import java.util.Scanner;
public class t23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a point with two coordinates :");
        float x=input.nextFloat();
        float y=input.nextFloat();
        input.close();
        String word=null;
        if( (x-0)<=10/2 && (y-0)<=5/2 )
            word=" is";
        else
            word=" is not";
        System.out.print("Point ("+ x +", "+ y +") " + word  + " in the rectangle "  );
    }
}
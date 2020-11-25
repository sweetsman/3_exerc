package exercises;
import java.util.Scanner;
public class t29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print( "Enter circle1's center x-, y-coordinates, and radius: ");
        float x1=input.nextFloat();
        float y1=input.nextFloat();
        float r1=input.nextFloat();

        System.out.print( "Enter circle2's center x-, y-coordinates, and radius: ");
        float x2=input.nextFloat();
        float y2=input.nextFloat();
        float r2=input.nextFloat();
        input.close();

        float d=(float) Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
        if( d <= Math.abs(r1-r2) )
            System.out.print(" cricle2 is inside circle1 ");
        else if( d <= (r1+r2) )
            System.out.print(" cricle2 overlaps circle1 ");
        else
            System.out.print(" cricle2 does not overlap circle1 ");

    }
}

package exercises;
import java.util.Scanner;
public class t22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a point with two coordinates :");
        float x=input.nextFloat();
        float y=input.nextFloat();
        input.close();
        float d= (float) Math.pow( (Math.pow(x, 2) + Math.pow(y, 2)) , 0.5 );
        String word=null;
        if(d<=10)
            word=" is";
        else
            word=" is not";
        System.out.print("Point ("+ x +", "+ y +") " + word  + " in the circle "  );
    }
}

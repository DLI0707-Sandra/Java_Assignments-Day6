package interfaces;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius:");
        float radius=scanner.nextFloat();
        float area;
        Function<Float, Float> circle_area= r-> (float) (22*r*r/7);
        System.out.printf("Area:%.2f",circle_area.apply(radius));
    }
}

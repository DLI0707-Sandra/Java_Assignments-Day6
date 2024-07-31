package interfaces;

import java.util.Scanner;

@FunctionalInterface
interface findsquare
{
    public int square(int number);

    default void displayMessage()
    {
        System.out.println("Square calculated");
    }
}

public class CustomInterface implements findsquare
{
    public int square(int number)
    {
        return number*number;
    }

    public static void main(String[] args)
    {
        CustomInterface customObject=new CustomInterface();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        System.out.println("Result:"+customObject.square(scanner.nextInt()));
        customObject.displayMessage();
    }
}

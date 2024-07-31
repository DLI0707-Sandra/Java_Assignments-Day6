package interfaces;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionInterface
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the strings:");
        String string1=scanner.next();
        String string2=scanner.next();
        BiFunction<String,String,String> concatinate=(string_1, string_2)->string_1+" "+string_2;
        System.out.println("After concatination:");
        System.out.println(concatinate.apply(string1,string2));


    }
}

package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapandReduce
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<number;i++)
            list.add(scanner.nextInt());
        System.out.print("Sum of squares on even numbers:");
        System.out.println(list.stream().filter((value)->value%2==0).map((element)->element*element).reduce(0,(value1,value2)->value1+value2));
    }
}

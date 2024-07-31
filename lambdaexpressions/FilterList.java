package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterList
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        System.out.println("Enter the strings:");
        for(int i=0;i<number;i++)
            list.add(scanner.next());
        List<String >strings_starting_with_A=list.stream().filter(string->string.charAt(0)=='A').collect(Collectors.toList());
        System.out.println("Strings starting with A");
        System.out.println(strings_starting_with_A);
    }
}

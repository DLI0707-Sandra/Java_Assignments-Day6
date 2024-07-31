package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PredicateComposition
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
        System.out.println("Enter the substring to be searched:");
        String search=scanner.next();
        System.out.println("Strings with length greater than 5 and contaning substring "+search);
        System.out.println(list.stream().filter((string)->string.length()>5).filter((string1)->string1.contains(search)).collect(Collectors.toList()));
    }
}

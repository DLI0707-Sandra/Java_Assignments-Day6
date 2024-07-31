package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerInterface
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
        Consumer <List<String>> uppercase=strings->{
            for(String string:strings)
        {
            System.out.println(string.toUpperCase());

        }};

        uppercase.accept(list);

    }
}

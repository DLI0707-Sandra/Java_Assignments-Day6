package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalHandling
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
        Optional<Integer>maximum=list.stream().max(Integer::compare);
        if(maximum.isPresent())
            System.out.println("Maximum element is:"+maximum.get());
        else
            System.out.println("No maximum");

    }
}

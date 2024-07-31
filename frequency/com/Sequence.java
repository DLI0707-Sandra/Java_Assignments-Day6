package frequency.com;

import java.util.*;

public class Sequence
{
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sequence:");
        String sequence=scanner.nextLine();
        String[] words=sequence.split(" ");
        List<String >words_list=new ArrayList<>();
        words_list.addAll(Arrays.asList(words));
        Map<String,Integer>frequency=new HashMap<>();
        for(String i:words_list)
        {
            if(frequency.containsKey(i))
            {
                int count=frequency.get(i)+1;
                frequency.put(i,count);
            }
            else
                frequency.put(i,1);
        }
//        System.out.println(frequency);
        int max=frequency.get(words_list.get(0));
        String largest=words_list.get(0);
        for (String i:words_list)
        {
            if(frequency.get(i)>max)
            {
                max=frequency.get(i);
                largest=i;
            }
        }
        int second=0;
        String secondl="";
        for(String i:words_list)
        {
            if(frequency.get(i)<max)
            {
                second=frequency.get(i);
                secondl=i;
                break;
            }
        }
        for (String i:words_list)
        {
            if(frequency.get(i)<max&&frequency.get(i)>second)
            {
                second=frequency.get(i);
                secondl=i;
            }
        }
        System.out.println(secondl);


    }
}

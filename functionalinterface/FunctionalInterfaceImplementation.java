package functionalinterface;

import java.util.Scanner;

@FunctionalInterface
interface insurance
{
    void calculatePremium();

    default void printDetails()
    {
        System.out.println("Details");
    }
    static void printChanges()
    {
        System.out.println("Added successfully");
    }
}


public class FunctionalInterfaceImplementation implements insurance
{

    String name;
    long amount;
    double premium;

    @Override
    public void calculatePremium()
    {
       premium= amount *1.5;
    }

    @Override
    public void printDetails()
    {
        System.out.println("Name:"+name+"\nBase:"+ amount +"\nPremium:"+premium);
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        FunctionalInterfaceImplementation insurance=new FunctionalInterfaceImplementation();
        System.out.println("Name:");
        insurance.name=scanner.next();
        System.out.println("Base:");
        insurance.amount =scanner.nextLong();
        insurance.calculatePremium();
        System.out.println("Details:");
        insurance.printDetails();
        functionalinterface.insurance.printChanges();
    }
}

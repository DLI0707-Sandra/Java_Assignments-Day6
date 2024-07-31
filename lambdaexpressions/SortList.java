package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Person
{
    String name;
    int age;
    long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name:"+name+"\nAge:"+age+"\nSalary:"+salary;
    }
}

public class SortList
{
    public static void main(String[] args)
    {
        List<Person> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int number=scanner.nextInt();
        for(int i=0;i<number;i++)
        {
            Person person=new Person();
            System.out.println("Name:");
            person.setName(scanner.next());
            System.out.println("Age:");
            person.setAge(scanner.nextInt());
            System.out.println("Salary:");
            person.setSalary(scanner.nextLong());
            list.add(person);
        }
        System.out.println("Before sorting");
        for(Person person:list)
        {
            System.out.println(person);
        }
        List<Person>sorted_on_age=new ArrayList<>();
        sorted_on_age=list.stream().sorted((person1,person2)->Integer.compare(person1.age,person2.age)).collect(Collectors.toList());
        System.out.println("After sorting on age:");
        for(Person person:sorted_on_age)
        {
            System.out.println(person);
        }
    }
}

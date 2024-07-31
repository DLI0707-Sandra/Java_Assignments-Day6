package insuranceapplication.com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Policies
{
    ArrayList<Policy> policies=new ArrayList<>();

    public void addPolicy(Policy policy)
    {
        policies.add(policy);
    }

    public void removePolicy(String policyNumber)
    {
        for(int i=0;i<policies.size();i++)
        {
            if(policies.get(i).policynumber.equals(policyNumber))
                policies.remove(i);
        }
    }

    public Policy findPolicy(String policyNumber)
    {
        for(int i=0;i<policies.size();i++)
        {
            if(policies.get(i).policynumber.equals(policyNumber))
                return policies.get(i);
        }
        return null;
    }

    public void viewAll()
    {
        for (int i=0;i<policies.size();i++)
        {
            System.out.println(policies.stream().map(policy -> "Number:"+policy.policynumber+"\nHolder name:"+policy.policyholder+"\nPremium:"+policy.premium_amount).collect(Collectors.toList()));
        }
    }

    public void filterByamount()
    {
        System.out.println(policies.stream().filter(policy -> policy.premium_amount>1200).collect(Collectors.toList()));
    }

    public void inGivenRange()
    {
        System.out.println(policies.stream().filter(policy -> policy.premium_amount>1000).filter(policy -> policy.premium_amount<2000).collect(Collectors.toList()));
    }

    public void sortByName()
    {
        System.out.println(policies.stream().sorted((policy1,policy2)->policy1.policyholder.compareTo(policy2.policyholder)).collect(Collectors.toList()));
    }

    public void totalPremium()
    {
        System.out.println(policies.stream().mapToDouble(policy -> policy.premium_amount).sum());
//        System.out.println(policies.stream().mapToDouble(policy -> policy.premium_amount).reduce(0,(premium1,premium2)->premium1+premium2));
    }

    public void highestPremium()
    {
        System.out.println(policies.stream().mapToDouble(policy-> policy.premium_amount).max());
    }


    public void getByInitial(char initial)
    {
        System.out.println(policies.stream().filter(policy -> policy.policyholder.charAt(0)==initial).collect(Collectors.toList()));
    }

    public double getAveragePremium()
    {
        double sum=policies.stream().mapToDouble(policy-> policy.premium_amount).sum();
        return sum/policies.size();
    }

    public void sortByPremium()
    {
        System.out.println(policies.stream().sorted((policy1,polciy2)->Double.compare(policy1.premium_amount,polciy2.premium_amount)));
    }

    public void gethigherPolicy()
    {
        System.out.println(policies.stream().filter(policy -> policy.premium_amount>2000));
    }

    public void inRange(double start,double end)
    {
        System.out.println(policies.stream().filter(policy -> policy.premium_amount>start&&policy.premium_amount<end));
    }

    public void getBySubstring(String subString)
    {
        System.out.println(policies.stream().filter(policy -> policy.policyholder.contains(subString)));
    }

    public void getUniqueNames()
    {
        Set<String> unique=new HashSet<>();

        System.out.println(policies.stream().map(policy -> policy.policyholder).map(name->unique.add(name)));

        System.out.println(unique);
    }

    public Map<String,Double> createMap(Map<String,Double>new_map)
    {
        policies.stream().map(policy -> new_map.put(policy.policynumber,policy.premium_amount));
        return new_map;
    }


}

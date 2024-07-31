package insuranceapplication.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InsuranceManagement
{
    public static void main(String[] args) {
        Policies policies = new Policies();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add new policy\n2.Remove policies\n3.Update details\n4.Filter by premium amount\n5.Print all\n6.View sorted by policy holder name\n7.Compute total premium\n8.Premium between 1000 and 2000\n9.Policy with highest premium\n10.Group by initial\n11.Average Premium\n12.Sort by premium amount\n13. Policies with a premium amount greater than 2,000." +
                    "\n14.Policies in range\n15.Unique names\n16.Policies with holder name containing a substring\n17.Create map\n18.Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter policy details:");
                    System.out.println("Policy number:");
                    String policyNumber = scanner.next();
                    System.out.println("Policy holder name:");
                    scanner.nextLine();
                    String policyHolder = scanner.nextLine();
                    System.out.println("Premium amount:");
                    long policyPremium = scanner.nextLong();
                    Policy policy = new Policy(policyNumber, policyHolder, policyPremium);
                    policies.addPolicy(policy);
                    break;
                case 2:
                    System.out.println("Enter thr policy number :");
                    String policynumber = scanner.next();
                    policies.removePolicy(policynumber);
                    break;
                case 3:
                    System.out.println("Enter the policy number of the policy to be updated:");
                    String policy_number = scanner.next();
                    Policy oldpolicy = policies.findPolicy(policy_number);
                    System.out.println("Enter the field to be updated:");
                    String field = scanner.next();
                    switch (field) {
                        case "Policynumber":
                            System.out.println("Enter the new value:");
                            oldpolicy.setPolicynumber(scanner.next());
                            break;
                        case "Policyholder":
                            System.out.println("Enter the new value:");
                            scanner.nextLine();
                            oldpolicy.setPolicyholder(scanner.nextLine());
                            break;
                        case "Amount":
                            System.out.println("Enter the new value:");
                            oldpolicy.setPremium_amount(scanner.nextLong());
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Policies with premium amount greater than 1200:");
                    policies.filterByamount();
                    break;
                case 5:
                    System.out.println("All policies are listed below:");
                    policies.viewAll();
                    break;
                case 6:
                    System.out.println("Policies sorted by policy holder name:");
                    policies.sortByName();
                    break;
                case 7:
                    System.out.println("Total premium amount:");
                    policies.totalPremium();
                    break;
                case 8:
                    System.out.println("Policies with premium in range 1000 and 2000:");
                    policies.inGivenRange();
                    break;
                case 9:
                    System.out.println("Details of policy with highest premium: ");
                    policies.highestPremium();
                    break;
                case 10:
                    System.out.println("Enter the initial:");
                    policies.getByInitial(scanner.next().charAt(0));
                    break;
                case 11:
                    System.out.printf("Average premium:%.2f",policies.getAveragePremium());
                    break;
                case 12:
                    System.out.println("Details of policies in order of premium amount:");
                    policies.sortByPremium();
                    break;
                case 13:
                    System.out.println("Policies with premium greater than 2000:");
                    policies.gethigherPolicy();
                    break;
                case 14:
                    System.out.println("Enter range:");
                    double start=scanner.nextDouble();
                    double end=scanner.nextDouble();
                    policies.inRange(start,end);
                    break;
                case 15:
                    System.out.println("Unique holder names:");
                    policies.getUniqueNames();
                    break;
                case 16:
                    System.out.println("Enter the substring to be searched:");
                    policies.getBySubstring(scanner.next());
                    break;
                case 17:
                    Map<String,Double>map=new HashMap<>();
                    policies.createMap(map);
                    System.out.println(map);
                    break;
                case 18:
                    System.out.println("Exiting!");
                    break;
            }

        } while (choice != 18);
    }
}

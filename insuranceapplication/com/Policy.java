package insuranceapplication.com;

public class Policy
{
    String policynumber;
    String policyholder;
    double premium_amount;


    public Policy(String policynumber, String policyholder, double premium_amount)
    {
        this.policynumber=policynumber;
        this.policyholder=policyholder;
        this.premium_amount =premium_amount;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getPolicyholder() {
        return policyholder;
    }

    public void setPolicyholder(String policyholder) {
        this.policyholder = policyholder;
    }


    public double getPremium_amount() {
        return premium_amount;
    }

    public void setPremium_amount(double premium_amount) {
        this.premium_amount = premium_amount;
    }

    @Override
    public String toString() {
        return "Policy Number:"+policynumber+"\nPolicy holder name:"+policyholder+"\nPremium amount"+ premium_amount;
    }
}

package accounts;

public class SilverCheckingAccount extends CheckingAccount {
    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calRewardPoints(double cost) {
        return (int) (cost * 25);
    }
}

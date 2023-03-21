package accounts;

public abstract class CheckingAccount extends Account {
    private int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost) {
        if (cost > balance) {
            return false;
        }

        balance -= cost;
        rewardPoints += calRewardPoints(cost);
        return true;
    }

    public abstract int calRewardPoints(double cost);

    public int getRewardPoints() {
        return rewardPoints;
    }
}

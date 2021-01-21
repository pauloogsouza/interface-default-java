package model.services;

public class UsaInterestServices implements InterestService {

    private final Double interestRate = 1.0;

    public UsaInterestServices() {
    }

    public double getInterestRate() {
        return interestRate;
    }
}

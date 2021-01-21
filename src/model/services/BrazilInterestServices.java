package model.services;

public class BrazilInterestServices implements InterestService {

    private final Double interestRate = 2.0;

    public BrazilInterestServices() {
    }

    public double getInterestRate() {
        return interestRate;
    }
}

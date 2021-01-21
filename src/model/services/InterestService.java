package model.services;

public interface InterestService {

    double getInterestRate();

    default Double payment(double amount, int months) {
        return amount * Math.pow((1 + (getInterestRate() / 100)), months);
    }
}

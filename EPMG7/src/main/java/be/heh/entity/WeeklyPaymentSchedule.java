package be.heh.entity;

public class WeeklyPaymentSchedule implements PaymentSchedule {
    @Override
    public String choiceDate() {
        return "Vous serez payé tous les vendredris";
    }
}

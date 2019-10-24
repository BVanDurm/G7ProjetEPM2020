package be.heh.entity;

import be.heh.entity.PaymentSchedule;

public class MonthlyPaymentySchedule implements PaymentSchedule {
    @Override
    public String choiceDate() {
        return "Vous serez payé à la fin du mois";
    }
}

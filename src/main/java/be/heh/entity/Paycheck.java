package be.heh.entity;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Paycheck {

    private double Pay;
    private Calendar PayStart;
    private Calendar PayEnd;
    private Map<String, String> Period;

    public Paycheck(Calendar payStart, Calendar payEnd)
    {
        this.PayStart = payStart;
        this.PayEnd = payEnd;
        Period = new HashMap<>();
    }

    public double getPay()
    {
        return Pay;
    }

    public void setPay(double Pay)
    {
        this.Pay = Pay;
    }

    public Calendar PayStart() { return PayStart;}

    public Calendar PayEnd() { return PayEnd;}

    public String getPeriod(String name){ return Period.get(name);}

    public void setPeriod(String name, String value){ Period.put(name, value);}

}

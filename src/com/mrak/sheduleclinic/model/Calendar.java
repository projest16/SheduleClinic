package com.mrak.sheduleclinic.model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    String selectedMonth;
    List<String> months = new ArrayList<String>();

    public String getSelectedMonth() {
        return selectedMonth;
    }

    public void setSelectedMonth(String selectedMonth) {
        this.selectedMonth = selectedMonth;
    }

    public List<String> getMonths() {
        return months;
    }

    public void setMonths(List<String> months) {
        this.months = months;
    }

    public Calendar() {
        months.add("January");
        months.add("February");
    }
}

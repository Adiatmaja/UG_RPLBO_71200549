package com.ug6.soal1;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.ArrayList;

public class Production {
    private int productionCapacity;
    private ArrayList<LocalDate> productionDate;
    private ArrayList<Long> productionDueDays;
    private double costCalculation;

    public Production(final int productionCapacity, final ArrayList<LocalDate> productionDate, final ArrayList<Long> productionDueDays) {
        this.costCalculation = 0.0;
        this.setProductionCapacity(productionCapacity);
        this.setProductionDate(productionDate);
        this.setProductionDueDays(productionDueDays);
    }

    public boolean checkPhonesSpecification(final String androidCode) {
        int index = 0;
        boolean status = false;
        for (final String androidLevel : Codes.ANDROIDCODES) {
            status = (!androidCode.equalsIgnoreCase(androidLevel) || index >= 3);
            ++index;
        }
        return status;
    }

    public boolean checkPhonesSpecification(final String androidCode, final int ramCapacity, final int romCapacity) {
        int index = 0;
        boolean status = false;
        System.out.println("Starting with status " + status);
        for (final String androidLevel : Codes.ANDROIDCODES) {
            if (index <= 4 && androidLevel.equalsIgnoreCase(androidCode)) {
                if (ramCapacity <= 8 && ramCapacity >= 1 && romCapacity <= 128 && romCapacity >= 32) {
                    status = true;
                }
            }
            else if (index > 4 && index < Codes.ANDROIDCODES.size() - 1 && androidLevel.equalsIgnoreCase(androidCode) && ramCapacity <= 16 && ramCapacity >= 4 && romCapacity <= 256 && romCapacity >= 64) {
                status = true;
            }
            ++index;
        }
        System.out.println("Finish checking with status " + status);
        return status;
    }

    public void conductProduction(final Phones phone) {
        final long productionDuration = this.getProductionCapacity() * 3L;
        final LocalDate today = LocalDate.now();
        this.getProductionDate().add(today);
        final LocalDate productionDueDate = today.plusDays(productionDuration);
        final long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
        final double cost = this.getProductionCapacity() * 1000 * (double)daysBetweenProduction;
        this.setCostCalculation(cost);
        System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + today);
        System.out.println("Production Due date: " + productionDueDate);
        System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
        System.out.println("Calculation Production Cost: Rp " + this.getCostCalculation());
    }

    public void conductProduction(final Phones phone, final float productionRate) {
        if (productionRate >= 0.0f && productionRate <= 2.0f) {
            final long productionDuration = (long)(this.getProductionCapacity() * 3L * productionRate);
            final LocalDate today = LocalDate.now();
            this.getProductionDate().add(today);
            final LocalDate productionDueDate = today.plusDays(productionDuration);
            final long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
            final double cost = this.getProductionCapacity() * 1000 * (double)daysBetweenProduction * 2.0;
            this.setCostCalculation(cost);
            System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + today);
            System.out.println("Production Due date: " + productionDueDate);
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long)this.getCostCalculation());
        }
        else {
            System.out.println("Please Input valid Production Rate");
        }
    }

    public int getProductionCapacity() {
        return this.productionCapacity;
    }

    public void setProductionCapacity(final int productionCapacity) {
        this.productionCapacity = productionCapacity;
    }

    public ArrayList<LocalDate> getProductionDate() {
        return this.productionDate;
    }

    protected void setProductionDate(final ArrayList<LocalDate> productionDate) {
        this.productionDate = productionDate;
    }

    public double getCostCalculation() {
        return this.costCalculation;
    }

    public void setCostCalculation(final double costCalculation) {
        this.costCalculation = costCalculation;
    }

    public ArrayList<Long> getProductionDueDays() {
        return this.productionDueDays;
    }

    public void setProductionDueDays(final ArrayList<Long> productionDueDays) {
        this.productionDueDays = productionDueDays;
    }
}
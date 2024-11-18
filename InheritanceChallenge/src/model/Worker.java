package model;

import java.time.LocalDate;
import java.time.Period;

public class Worker {
    private String name;
    private LocalDate birthDate;
    protected LocalDate endDate;

    public Worker() {
    }

    public Worker(String name, LocalDate birthDate, LocalDate endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(LocalDate endDate) {
        this.endDate = LocalDate.now();
    }

}

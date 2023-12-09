package com.ziwatest.bankstatement;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;
public class Request {
    @NotNull(message = "Start date cannot be null")
    @Past(message = "Start date must be in the past")
    private LocalDate startDate;

    @NotNull(message = "End date cannot be null")
    @Past(message = "Start date must be in the past")
    private LocalDate endDate;

    @NotNull(message = "Email address cannot be null")
    @Email(message = "Invalid email address")
    private String emailAddress;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

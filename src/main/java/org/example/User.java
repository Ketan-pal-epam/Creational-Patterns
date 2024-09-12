package org.example;

public class User {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String highestLevelOfEducation;
    private String sex;
    private int yearsOfExperience;
    private boolean automationTester;
    private String date;

    // Constructor
    public User(String firstName, String lastName, String jobTitle, String highestLevelOfEducation, String sex, int yearsOfExperience, boolean automationTester, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.highestLevelOfEducation = highestLevelOfEducation;
        this.sex = sex;
        this.yearsOfExperience = yearsOfExperience;
        this.automationTester = automationTester;
        this.date = date;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getHighestLevelOfEducation() {
        return highestLevelOfEducation;
    }

    public String getSex() {
        return sex;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public boolean isAutomationTester() {
        return automationTester;
    }

    public String getDate() {
        return date;
    }
}
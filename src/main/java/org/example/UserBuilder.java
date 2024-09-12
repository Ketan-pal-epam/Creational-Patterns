package org.example;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String highestLevelOfEducation;
    private String sex;
    private int yearsOfExperience;
    private boolean automationTester;
    private String date;

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public UserBuilder setHighestLevelOfEducation(String highestLevelOfEducation) {
        this.highestLevelOfEducation = highestLevelOfEducation;
        return this;
    }

    public UserBuilder setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public UserBuilder setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
        return this;
    }

    public UserBuilder setAutomationTester(boolean automationTester) {
        this.automationTester = automationTester;
        return this;
    }

    public UserBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, jobTitle, highestLevelOfEducation, sex, yearsOfExperience, automationTester, date);
    }
}

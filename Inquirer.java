package edu.ucalgary.oop;

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFO;
    private String SERVICES_PHONE;

    public Inquirer(String FIRST_NAME, String LAST_NAME, String SERVICES_PHONE, String INFO) {
        if (firstName == null || lastName == null || servicesPhone == null || info == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.SERVICES_PHONE = SERVICES_PHONE;
        this.INFO = INFO;
    }

    // Getters
    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return LAST_NAME;
    }

    public String getInfo() {
        return INFO;
    }

    public String getServicesPhone() {
        return SERVICES_PHONE;
    }
}

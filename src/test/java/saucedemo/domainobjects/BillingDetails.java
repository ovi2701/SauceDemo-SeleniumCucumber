package saucedemo.domainobjects;

public class BillingDetails {
    private String billingFirstName;
    private String billingLastName;
    private String billingZipcode;

    public BillingDetails(String billingFirstName, String billingLastName, String billingZipcode) {
        this.billingFirstName = billingFirstName;
        this.billingLastName = billingLastName;
        this.billingZipcode = billingZipcode;
    }

    public String getBillingFirstName() {
        return billingFirstName;
    }

    public void setBillingFirstName(String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {
        this.billingLastName = billingLastName;
    }

    public String getBillingZipcode() {
        return billingZipcode;
    }

    public void setBillingZipcode(String billingZipcode) {
        this.billingZipcode = billingZipcode;
    }
}

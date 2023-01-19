package W1L1Assignment.Problem3;

public class Customer {
    String fName, lName, SSN;
    Address billingAddress, shippingAddress;

    public Customer(String fName, String lName, String SSN, Address shippingAddress, Address billingAddress) {
        this.fName = fName;
        this.lName = lName;
        this.SSN = SSN;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
    @Override
    public String toString(){
        return "[" + fName + "," + lName + "," + "Social Security number: " + SSN + "]";
    }
}

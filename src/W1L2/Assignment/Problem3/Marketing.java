package W1L2.Assignment.Problem3;

public class Marketing {
    private String empName,pName;
    private double salesAmount;

    public Marketing(String empName, String pName, double salesAmount) {
        this.empName = empName;
        this.pName = pName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return empName;
    }

    public void setEmployeeName(String employeeName) {
        this.empName = employeeName;
    }

    public String getProductName() {
        return pName;
    }

    public void setProductName(String productName) {
        this.pName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "\nEmplooyee name : " + empName + "\n" +
                "Product name: " + pName + "\n" +
                "Sales amount: " + salesAmount;
    }
}

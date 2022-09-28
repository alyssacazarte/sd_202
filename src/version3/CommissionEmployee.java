
package version3;


public class CommissionEmployee extends Employee {
    private float totalSales;

    public CommissionEmployee() {
    }
   
    public CommissionEmployee(float totalSales) {
        this.totalSales = totalSales;
    }

    public CommissionEmployee(float totalSales, int empID, String empName) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
    }
        public double computeSalary() {
        float rate;
        if(totalSales < 10000 && totalSales >= 0){
            rate = 0.05f;
        } else if (totalSales >= 10000 && totalSales < 50000) {
            rate = 0.1f;
        } else if (totalSales >= 50000 && totalSales < 100000) {
            rate = 0.15f;
        } else if (totalSales >= 100000){
            rate = 0.3f;
        } else {
            rate = 0;
        }
           return rate * totalSales; 
    }
     @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        
        stb.append(super.toString());
        stb.append("\nTotal Sales: ");
        stb.append (String.format("Php %,.2f", this.getTotalSales()));
        stb.append("\nSalary: ");
        stb.append(String.format("Php %,.2f", this.computeSalary()));
          
        return stb.toString();
    }  
}


package version4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
  private float baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(float baseSalary, float totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(float baseSalary, float totalSales, int empID, String empName) {
        super(totalSales, empID, empName);
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
     public double computeSalary() {
           return super.computeSalary()+ baseSalary; 
  
//    }
//     @Override
//    public String toString() {
//        StringBuilder stb = new StringBuilder();
//        
//        stb.append("Employee ID: ");
//        stb.append(this.getEmpID());
//        stb.append("\n Employee Name: ");
//        stb.append(this.getEmpName());
//        stb.append("\nTotal Sales: ");
//        stb.append (String.format("Php %,.2f", this.getTotalSales()));
//        stb.append("\nSalary: ");
//        stb.append(String.format("Php %,.2f", this.computeSalary()));
//          
//        return stb.toString();
    }    
}

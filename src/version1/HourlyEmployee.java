
package version1;


public class HourlyEmployee {
    private int empID;
    private String empName;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }
    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    public double computeSalary() {
        float time = this.totalHoursWorked;
        float me = 0;
        
        if(time > 40) {
           me = time - 40;
           time = 40;
        }
        
        return time * ratePerHour + me * ratePerHour * 1.5;
    }
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        
        stb.append("Employee ID: ");
        stb.append(this.getEmpID());
        stb.append("\n Employee Name: ");
        stb.append(this.getEmpName());
        stb.append("\nTotal Hours Worked: ");
        stb.append(this.getTotalHoursWorked());
        stb.append(" hour(s)");
        stb.append("\n Rate Per Hour: ");
        stb.append (String.format("Php %,.2f", this.getRatePerHour()));
        stb.append("\nSalary: ");
        stb.append(String.format("Php %,.2f", this.computeSalary()));
          
        return stb.toString();
    }  
}


package version2;


public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, float ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, float ratePerHour, int empID, String empName) {
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        
        stb.append(super.toString());
        stb.append("\nTotal Hours Worked: ");
        stb.append(this.getTotalHoursWorked());
        stb.append(" hour(s)");
        stb.append("\n Rate Per Hour: ");
        stb.append (String.format("Php %,.2f", this.getRatePerHour()));
        stb.append("\nSalary: ");
        stb.append(String.format("Php %,.2f", this.computeSalary()));
        return stb.toString();
//    }
//
//    @Override
//    public void displayInfo() {
//        super.displayInfo(); 
    }
    
}


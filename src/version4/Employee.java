
package version4;

public abstract class Employee {
     private int empID;
    private String empName;

    public Employee() {
    }
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
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
    public void displayInfo() {
        System.out.println(this);
    }
    public abstract double computeSalary();//to get the compute salary in the testingmain and Implement polymorphism on version 2 
//    but make the Employee class as an abstract class with an abstract method for computeSalary().
//        return 0;
//    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        
        stb.append("Employee ID: ");
        stb.append(this.getEmpID());
        stb.append("\n Employee Name: ");
        stb.append(this.getEmpName());
        
        return stb.toString();
    }  
    
    

}


package version4;


public class TestingMain {
    public static void main(String [] args){
        Employee[] emp = new Employee [6];
        
        emp[0] = new HourlyEmployee(40, 100, 21103760, "Alyssa Cazarte");
        emp[1] = new CommissionEmployee(40000, 21103813, "Christy Toquero");
        emp[2] = new HourlyEmployee(45, 150, 21103867, "Pia Mae Mequizo");
        emp[3] = new BasePlusCommissionEmployee(15000, 75000, 21103922, "Jovie Bendijo");
        emp[4] = new CommissionEmployee(45000, 21103835, "Anna Mae Jorge");
        emp[5] = new PieceWorkerEmployee(15, 10, 21103835, "Anna Mae Jorge");
        
        for(Employee emp1 : emp){
            System.out.println(emp1);
            System.out.println("");
            
        }
        for(Employee emp1 : emp){
            System.out.println(String.format("%s - Php %,.2f", emp1.getEmpName(), emp1.computeSalary())); //to get the salary of each employee
            
        }
    }
}

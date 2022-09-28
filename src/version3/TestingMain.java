
package version3;

public class TestingMain {
    public static void main(String[] args){
         EmployeeRoster eroster = new EmployeeRoster();
         eroster.countHourlyEmployee();
         eroster.countCommissionEmployee();
         eroster.countPieceWorkerEmployee();
         eroster.countBasePlusCommissionEmployee();
         eroster.displayHourlyEmployee();
         eroster.displayCommissionEmployee();
         eroster.displayPieceWorkerEmployee();
         eroster.displayBasePlusCommissionEmployee();
         eroster.addEmployee();
         eroster.removeEmployee(21103760);
         eroster.displayEmployee();

    }
}

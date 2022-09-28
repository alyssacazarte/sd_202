
package version3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Formatter;



public class EmployeeRoster {
    private Employee[] hourlyemployeelists = {
        new HourlyEmployee(40, 150, 21103760, "Alyssa Cazarte"),
        new HourlyEmployee(40, 150, 21103835, "Anna Mae Jorge"),
        new HourlyEmployee(40, 150, 21103867, "Pia Mae Mequizo"),
        new HourlyEmployee(40, 150, 21103813, "Christy Toquero"),
        new HourlyEmployee(40, 150, 21103922, "Jovie Bendijo"),
        
        
    };
    public Employee[] getHourlyemployeelists(){
        return hourlyemployeelists;
    }

    public void setHourlyemployeelists(Employee[] hourlyemployeelists) {
        this.hourlyemployeelists = hourlyemployeelists;
    }
    private Employee[] commissionemployeelists = {
        new CommissionEmployee(150, 21103760, "Junnalyn Doning"),
        new CommissionEmployee(150, 21103835, "Lesly Bataluna"),
        new CommissionEmployee(150, 21103867, "Hannag Cagaanan"),
        new CommissionEmployee(150, 21103813, "Jamaila Paquibas"),
        new CommissionEmployee(150, 21103922, "Ma.Elena Fuentes"),
    };

    public Employee[] getCommissionemployeelists() {
        return commissionemployeelists;
    }

    public void setCommissionemployeelists(Employee[] commissionemployeelists) {
        this.commissionemployeelists = commissionemployeelists;
    }
    private Employee[] pieceworkeremployeelists = {
      new PieceWorkerEmployee(15,10, 21103760, "J.Marie Cartalla"),
      new PieceWorkerEmployee(15,10, 21103835, "Rowena Pial"),
      new PieceWorkerEmployee(15,10, 21103867, "Rogina Rolloque"),
      new PieceWorkerEmployee(15,10, 21103813, "Leah MangMang"),
      new PieceWorkerEmployee(15,10, 21103922, "Shobi Umaran"),
    };

    public Employee[] getPieceworkeremployeelists() {
        return pieceworkeremployeelists;
    }

    public void setPieceworkeremployeelists(Employee[] pieceworkeremployeelists) {
        this.pieceworkeremployeelists = pieceworkeremployeelists;
    }
    private Employee[] basepluscommissionemployeelists = {
      new BasePlusCommissionEmployee(15000, 75000, 21103922, "Mary Grace Vellina"),
      new BasePlusCommissionEmployee(15000, 75000, 21103835, "Soseit Bedoria"),
      new BasePlusCommissionEmployee(15000, 75000, 21103867, "Via Enopia"),
      new BasePlusCommissionEmployee(15000, 75000, 21103813, "Jo-ann Bernadez"),
      new BasePlusCommissionEmployee(15000, 75000, 21103922, "Bebei Grace Balbuena"),
    };

    public Employee[] getBasepluscommissionemployeelists() {
        return basepluscommissionemployeelists;
    }

    public void setBasepluscommissionemployeelists(Employee[] basepluscommissionemployeelists) {
        this.basepluscommissionemployeelists = basepluscommissionemployeelists;
    }
    public void displayHourlyEmployee(){
        EmployeeRoster eroster = new EmployeeRoster();
        Employee[] display = eroster.getHourlyemployeelists();
        System.out.println("********************************************************************************************");
        System.out.println("\nHourly Employee Lists\n");
        for (Employee display1 : display) {
            System.out.println(display1);
            System.out.println("");
        }  
        
    }
    public void countHourlyEmployee(){
        EmployeeRoster eroster = new EmployeeRoster();
        Employee[] display = eroster.getHourlyemployeelists();
        System.out.println("********************************************************************************************");
        System.out.println("\nTotal number of Hourly Employee: " + Array.getLength(display));
    }
    public void displayCommissionEmployee(){
        EmployeeRoster eroster = new EmployeeRoster();
        Employee[] display = eroster.getCommissionemployeelists();
         System.out.println("********************************************************************************************");
        System.out.println("\nCommission Employee Lists\n");
        for (Employee display1 : display) {
            System.out.println(display1);
            System.out.println("");
        }
    }
    public void countCommissionEmployee(){
        EmployeeRoster eroster = new EmployeeRoster();
        Employee[] display = eroster.getCommissionemployeelists();
        System.out.println("\nTotal number of Commission Employee: " + Array.getLength(display));

    }
    public void displayPieceWorkerEmployee(){
        EmployeeRoster eroster = new EmployeeRoster();
        Employee[] display = eroster.getPieceworkeremployeelists();
         System.out.println("********************************************************************************************");
        System.out.println("\nPiece Worker Employee Lists\n");
        for (Employee display1 : display) {
            System.out.println(display1);
            System.out.println("");
        }
    }
    public void countPieceWorkerEmployee(){
        EmployeeRoster eroster = new EmployeeRoster();
        Employee[] display = eroster.getPieceworkeremployeelists();
        System.out.println("\nTotal number of Piece Worker Employee: " + Array.getLength(display));
       
    }
     public void displayBasePlusCommissionEmployee(){
        EmployeeRoster eroster = new EmployeeRoster();
        Employee[] display = eroster.getBasepluscommissionemployeelists();
         System.out.println("********************************************************************************************");
        System.out.println("\nBase Plus Commission Employee Lists\n");
        for (Employee display1 : display) {
            System.out.println(display1);
            System.out.println("");
            
        }
    }
     public void countBasePlusCommissionEmployee(){
        EmployeeRoster eroster = new EmployeeRoster();
        Employee[] display = eroster.getBasepluscommissionemployeelists();
        System.out.println("\nTotal number of Base Plus Commission Employee: " + Array.getLength(display));
  
    }
    public void addEmployee(){
        System.out.println("");
         System.out.println("********************************************************************************************");
        Employee[] emp = this.getHourlyemployeelists();
        Employee[] add = {
        new HourlyEmployee(40, 150, 21100000, "Jei Ann Bayer"),
        };
        System.out.println("Employee List after Adding: \n" + Arrays.toString(add) + Arrays.toString(emp));
        
    }
    public void removeEmployee(int empID){
//        Employee[] emp = this.getHourlyemployeelists();
//        int[] empID = {21102760, 21103813, 21103533, 21105223, 21107802};
//        int remove = 2; 
//        if (empID == null
//            || remove&lt; 0
//            || remove&gt;= tensArray.length) { 
//        System.out.println("Employee removed:");
//    }
//    
//        int[] proxyArray = new int[empID.length-1];
//        for (int i = 0, k = 0; i &lt;empID.length; i++){
//        if (i == remove){
//            continue;
//        }
//        proxyArray[k++] = empID[i];
//    } 
//        System.out.println("Employee removed: " + Arrays.toString(proxyArray) );
        System.out.println("");
         System.out.println("********************************************************************************************");
        Employee[] emp = new Employee[hourlyemployeelists.length - 1];
        for (int i = 0; i < hourlyemployeelists.length; i++) {
            if (hourlyemployeelists[i].empID == (empID)) {
                System.arraycopy(hourlyemployeelists, 0, emp, 0, i);
                System.arraycopy(hourlyemployeelists, i + 1, emp, i, hourlyemployeelists.length - i - 1);
            }
        }
        System.out.println("Employee List after Deleting: \n"
                + Arrays.toString(emp));
    
    }
    
    public void displayEmployee(){
        int display;
        System.out.println();
         System.out.println("********************************************************************************************");
        System.out.printf("%-20s | %-25s |%-20s |%-20s \n", "Employee ID", "Employee Name", "Salary", " Employee Type");
        for (display = 0; display < hourlyemployeelists.length; display++) {
        System.out.printf("%-20d | %-25s |Php%17.2f | %-20s \n", hourlyemployeelists[display].getEmpID(), hourlyemployeelists[display].getEmpName(),hourlyemployeelists[display].computeSalary(), hourlyemployeelists[display].getClass().getSimpleName());
        }
    }
    }
       
//         System.out.println("");
//         System.out.println("******************************************");
//         Employee[] hourlyemp = this.getHourlyemployeelists();
//         Employee[] commissionemp = this.getCommissionemployeelists();
//         Employee[] pieceemp = this.getPieceworkeremployeelists();
//         Employee[] basepluscomemp = this.getBasepluscommissionemployeelists();
//         
//         System.out.println(Arrays.toString(hourlyemp));
//         System.out.println(Arrays.toString(commissionemp));
//         System.out.println(Arrays.toString(pieceemp));
//         System.out.println(Arrays.toString(basepluscomemp));
// 
//    
//        }
//         System.out.println("****************************************************************");
//         int id[] = {21103760, 21103835, 21103867, 21103813, 21103922}; 
//         String name[] = {"Alyssa Cazarte", "Anna Mae Jorge", "Pia Mae Mequizo", "Christy Toquero", "Jovie Bendijo"}; 
//         String type[] = {"Hourly Employee", "Hourly Employee", "Hourly Employee", "Hourly Employee", "Hourly Employee"};
//         
//         fmt.format("%15s %15s %15s\n", "Employee ID", "Employee Name", "Employee Type"); 
//         
//         for (int n: id )   
//         for (String n1 : name)
//         for (String n2 : type)  
//        {  
//        fmt.format("%14s %14s %17s\n", n, n1, n2);
//        }  
//         for (String n1 : name)
//         {
//         fmt.format("%14s %14s %17s\n", n1);    
//         }
//         for (String n2 : type)
//         {
//         fmt.format("%14s %14s %17s\n", n2);  
//         }
 
    
    



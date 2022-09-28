
package version1;

public class TestingMain {
    public static void main(String [] args) {
        System.out.println("******************************************************************");
        System.out.println();
        System.out.println("Array for Hourly Employee");
        HourlyEmployee [] hle_list = new HourlyEmployee[5];
        
        hle_list[0] = new HourlyEmployee(21103870, "Alyssa Cazarte", 45, 100); //don't have a value 
        hle_list[1] = new HourlyEmployee(21103835, "Anna Mae Jorge", 45, 100);
        hle_list[2] = new HourlyEmployee(21103867, "Pia Mae Mequizo", 45, 100);
        hle_list[3] = new HourlyEmployee(21103813, "Christy Toquero", 45, 100);
        hle_list[4] = new HourlyEmployee(21103922, "Jovie Bendijo", 40, 100);

        for (HourlyEmployee emp : hle_list){
           System.out.println("");
           System.out.println(emp); 
        }
        System.out.println("******************************************************************");
        System.out.println();
        System.out.println("Array for Commission Employee");
        CommissionEmployee [] hle_list1 = new CommissionEmployee[5];
        
        
        hle_list1[0] = new CommissionEmployee(21103870,"Alyssa Cazarte", 30); 
        hle_list1[1] = new CommissionEmployee(21103835, "Anna Mae Jorge", 15);
        hle_list1[2] = new CommissionEmployee(21103867, "Pia Mae Mequizo", 10);
        hle_list1[3] = new CommissionEmployee(21103813, "Christy Toquero", 30);
        hle_list1[4] = new CommissionEmployee(21103922, "Jovie Bendijo", 10);

        for (CommissionEmployee emp1 : hle_list1){
           System.out.println("");
           System.out.println(emp1); 
        }
        System.out.println("******************************************************************");
        System.out.println();
        System.out.println("Array for Base Plus Commission Employee");
        BasePlusCommissionEmployee [] hle_list2 = new BasePlusCommissionEmployee[5];
        
        
        hle_list2[0] = new BasePlusCommissionEmployee(21103870,"Alyssa Cazarte", 30, 100000); 
        hle_list2[1] = new BasePlusCommissionEmployee(21103835, "Anna Mae Jorge", 15, 50000);
        hle_list2[2] = new BasePlusCommissionEmployee(21103867, "Pia Mae Mequizo", 10, 10000);
        hle_list2[3] = new BasePlusCommissionEmployee(21103813, "Christy Toquero", 5, 100000);
        hle_list2[4] = new BasePlusCommissionEmployee(21103922, "Jovie Bendijo", 10, 10000);

        for (BasePlusCommissionEmployee emp2 : hle_list2){
           System.out.println("");
           System.out.println(emp2); 
        }
        System.out.println("******************************************************************");
        System.out.println();
        System.out.println("Array for Piece Worker Employee");
        PieceWorkerEmployee [] hle_list3 = new PieceWorkerEmployee[5];
        
        
        hle_list3[0] = new PieceWorkerEmployee(21103870,"Alyssa Cazarte", 30, 10); 
        hle_list3[1] = new PieceWorkerEmployee(21103835, "Anna Mae Jorge", 15, 10);
        hle_list3[2] = new PieceWorkerEmployee(21103867, "Pia Mae Mequizo", 10, 10);
        hle_list3[3] = new PieceWorkerEmployee(21103813, "Christy Toquero", 5, 10);
        hle_list3[4] = new PieceWorkerEmployee(21103922, "Jovie Bendijo", 10, 10);

        for (PieceWorkerEmployee emp3 : hle_list3){
           System.out.println("");
           System.out.println(emp3); 
      
        }
        }
        
    
    }


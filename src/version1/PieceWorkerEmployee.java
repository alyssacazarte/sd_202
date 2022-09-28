
package version1;

public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private float totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public PieceWorkerEmployee(int empID, String empName, float totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(float totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    public double computeSalary() {
        float piefi = this.totalPiecesFinished;
        float times = 0;
        
        if(piefi >= 100) {
           times = piefi/100;
//           piefi = 100;
        float totalPiece = this.totalPiecesFinished;
//        int pieceFinished = 0;
//        int plusPiece = 0; 
//        int toqs = 0;
//        int chris = 0;
//        
//        if (totalPiece <= 99 && totalPiece >= 0) {
//            pieceFinished = (int) (totalPiece * ratePerPiece);
//        } else if (totalPiece / 100 != 0) {
//            toqs = (int) (totalPiece / 100);
//
//            plusPiece = (int) ((ratePerPiece * 10) * toqs);
//            chris = (int) (totalPiece * ratePerPiece);
//
//            pieceFinished = (chris + plusPiece);
//
//        } else {
//            return 0;
//        }
//
//        return pieceFinished;
        }
        
        return piefi * ratePerPiece ;
    
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
        stb.append("\nTotal Pieces Finished: ");
//        stb.append(this.getTotalPiecesFinished());
         stb.append (String.format("Php %,.2f", this.getTotalPiecesFinished()));
//        stb.append(" hour(s)");
        stb.append("\n Rate Per Piece: ");
        stb.append (String.format("Php %,.2f", this.getRatePerPiece()));
        stb.append("\nSalary: ");
        stb.append(String.format("Php %,.2f", this.computeSalary()));
          
        return stb.toString();
    }  
    
}

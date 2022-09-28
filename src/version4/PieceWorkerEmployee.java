
package version4;


public class PieceWorkerEmployee extends Employee {
     private float totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(float totalPiecesFinished, float ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(float totalPiecesFinished, float ratePerPiece, int empID, String empName) {
        super(empID, empName);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
        }
        
        return piefi * ratePerPiece ;
    }
     @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        
        stb.append(super.toString());
        stb.append("\nTotal Pieces Finished: ");
        stb.append (String.format("Php %,.2f", this.getTotalPiecesFinished()));
        stb.append("\nRate Per Piece: ");
        stb.append (String.format("Php %,.2f", this.getRatePerPiece()));
        stb.append("\nSalary: ");
        stb.append(String.format("Php %,.2f", this.computeSalary()));
          
        return stb.toString();
    }      
}

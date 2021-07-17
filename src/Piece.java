import java.util.ArrayList;

public class Piece {

    private final int id;
    private final String name;
    private final ArrayList<PieceType> pieceTypeList;

    private final int warmth;
    private final ArrayList<Integer> conflictedIdList;

    public Piece(int id,String name,ArrayList<PieceType> pieceTypeList,int warmth,ArrayList<Integer> conflictedIdList){
        this.id=id;
        this.name=name;
        this.pieceTypeList=pieceTypeList;
        this.warmth=warmth;
        this.conflictedIdList=conflictedIdList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<PieceType> getPieceTypeList() {
        return pieceTypeList;
    }

    public int getWarmth() {
        return warmth;
    }

    public ArrayList<Integer> getConflictedIdList() {
        return conflictedIdList;
    }
}

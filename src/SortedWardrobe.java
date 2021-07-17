import java.util.ArrayList;
import java.util.HashMap;

public class SortedWardrobe {

    private final HashMap<PieceType.T, ArrayList<Piece>> myWardrobeSortedBytType = new HashMap<>();

    public SortedWardrobe() {
        ArrayList<Piece> allPieces = DataReader.readData();


        ArrayList<Piece> coats = new ArrayList<>();
        ArrayList<Piece> pants = new ArrayList<>();
        ArrayList<Piece> shoes = new ArrayList<>();
        ArrayList<Piece> sweaters = new ArrayList<>();
        ArrayList<Piece> bases = new ArrayList<>();
        ArrayList<Piece> middles = new ArrayList<>();
        ArrayList<Piece> caps = new ArrayList<>();
        ArrayList<Piece> accessories = new ArrayList<>();


        for (Piece piece : allPieces) {
            for (PieceType pieceType : piece.getPieceTypeList()) {

                switch (pieceType.getType()) {
                    case Coat -> coats.add(piece);
                    case Pants -> pants.add(piece);
                    case Shoes -> shoes.add(piece);
                    case Sweater -> sweaters.add(piece);
                    case Base -> bases.add(piece);
                    case Middles -> middles.add(piece);
                    case Caps -> caps.add(piece);
                    case Accessories -> accessories.add(piece);
                }
            }
        }

        this.myWardrobeSortedBytType.put(PieceType.T.Coat, coats);
        this.myWardrobeSortedBytType.put(PieceType.T.Pants, pants);
        this.myWardrobeSortedBytType.put(PieceType.T.Shoes, shoes);
        this.myWardrobeSortedBytType.put(PieceType.T.Sweater, sweaters);
        this.myWardrobeSortedBytType.put(PieceType.T.Base, bases);
        this.myWardrobeSortedBytType.put(PieceType.T.Middles, middles);
        this.myWardrobeSortedBytType.put(PieceType.T.Caps, caps);
        this.myWardrobeSortedBytType.put(PieceType.T.Accessories, accessories);


    }


    public HashMap<PieceType.T, ArrayList<Piece>> getMyWardrobeSortedBytType() {
        return myWardrobeSortedBytType;
    }
}

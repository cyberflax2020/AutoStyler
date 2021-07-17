import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.ArrayList;

public class DataReader {

    static public ArrayList<Piece> readData() {

        ArrayList<Piece> allPieces = new ArrayList<>();

        try {

            String pathname = "src/input.txt";
            File filename = new File(pathname);
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename));
            BufferedReader br = new BufferedReader(reader);
            String line = "";

            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] attributes = line.split("/");

                int id = Integer.parseInt(attributes[0]);
                String name = attributes[1];

                ArrayList<PieceType> pieceTypeList = new ArrayList<>();
                String[] types = attributes[2].split(",");
                for (String type : types) {
                    pieceTypeList.add(new PieceType(type));
                }

                int warmth = Integer.parseInt(attributes[3]);

                ArrayList<Integer> conflictedIdList = new ArrayList<>();
                String[] conflicts = attributes[4].split(",");
                for (String conflict : conflicts) {
                    conflictedIdList.add(Integer.parseInt(conflict));

                }

                Piece piece = new Piece(id, name, pieceTypeList, warmth, conflictedIdList);
                allPieces.add(piece);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return allPieces;
    }


}
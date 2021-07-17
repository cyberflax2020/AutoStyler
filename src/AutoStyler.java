import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AutoStyler {

    ArrayList<ArrayList<Piece>> solutionList = new ArrayList<>();

    private final HashMap<PieceType.T, ArrayList<Piece>> typeMap;

    public AutoStyler() {
        SortedWardrobe sortedWardrobe = new SortedWardrobe();
        this.typeMap = sortedWardrobe.getMyWardrobeSortedBytType();


    }

    public ArrayList<ArrayList<Piece>> style() {

        for (int i = 0; i < 10; i++) {

            ArrayList<Piece> candidateSolution = new ArrayList<>();


            for (ArrayList<Piece> thisType : typeMap.values()) {
                Collections.shuffle(thisType);

                candidateSolution.add(thisType.get(0));

            }


            List<Integer> IntList = candidateSolution.stream().map(Piece::getId)
                    .collect(Collectors.toList());
            long count = IntList.stream().distinct().count();
            Boolean repeatedContained = Boolean.FALSE;
            if (IntList.size() != count) {
                repeatedContained = Boolean.TRUE;

            }

            boolean conflictContained = Boolean.FALSE;
            for (int selected = 0; selected < candidateSolution.size(); selected++) {
                for (int others = 0; others < candidateSolution.size(); others++) {
                    if (selected != others) {
                        ArrayList<Integer> ConIdList = candidateSolution.get(selected).getConflictedIdList();
                        if (ConIdList.contains(candidateSolution.get(others).getId())) {
                            conflictContained = Boolean.TRUE;
                        }
                    }
                }
            }

            if (!(repeatedContained | conflictContained)) {
                this.solutionList.add(candidateSolution);
            }


        }

        return this.solutionList;
    }

    public ArrayList<Integer> sumWarmth() {
        ArrayList<Integer> warmthList = new ArrayList<>();
        for (ArrayList<Piece> thisSolution : this.solutionList) {
            int totalWarmth = 0;
            for (Piece thisPiece : thisSolution) {
                totalWarmth += thisPiece.getWarmth();
            }
            warmthList.add(totalWarmth);
        }
        return warmthList;
    }


}

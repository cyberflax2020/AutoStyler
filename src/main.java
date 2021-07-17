import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        AutoStyler autoStyler = new AutoStyler();
        ArrayList<ArrayList<Piece>> solution = autoStyler.style();

        if (solution.size() == 0) {
            System.out.println("Rerun to get a solution");
        } else {
            ArrayList<Integer> allWarmth = autoStyler.sumWarmth();
            for (int i = 0; i < allWarmth.size(); i++) {
                StringBuilder display = new StringBuilder();
                for (Piece p : solution.get(i)) {
                    display.append(p.getId()).append(":").append(p.getName()).append(" / ");
                }
                display.append("Warmth:").append(allWarmth.get(i));
                System.out.println(display);

            }
        }
    }
}

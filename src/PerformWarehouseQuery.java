import java.util.*;
//Q1
// amazon warehouse test -> perform warehouse query(shipping 3 item at one time)
public class PerformWarehouseQuery {

    public static void main(String[] args) {

        List<List<Integer>> ab = new ArrayList<>();
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> b = Arrays.asList(6, 7, 8, 9, 10, 6);
        List<Integer> c = Arrays.asList(11, 12, 13, 14, 15);
        ab.add(a);
        ab.add(b);
        ab.add(c);
        int count = 0, index = 0;
        List<List<Integer>> zx = new ArrayList<>();
        List<Integer> cd = new ArrayList<>(3);
        for (int i = 0; i < ab.size(); i++) {
            for (int j = 0; j < ab.get(i).size(); j++) {
                if (cd.size() == 3) {
                    List<Integer> y = new ArrayList<>();
                    for (int z = 0; z < cd.size(); z++) {
                        y.add(cd.get(z));
                    }
                    zx.add(index, y);
                    index++;
                    cd.clear();
                }
                cd.add(ab.get(i).get(j));
            }
        }
        for (int k = 0; k < zx.size(); k++) {
            for (int l = 0; l < zx.get(k).size(); l++) {
                System.out.print(zx.get(k).get(l));
            }
            System.out.println();
        }
    }
}
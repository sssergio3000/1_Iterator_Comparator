import java.util.*;


public class IteratorSample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        for (Integer elem : list) {
            System.out.println(elem);

        }
        System.out.println("______________________");
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

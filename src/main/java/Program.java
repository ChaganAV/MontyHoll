import java.util.*;

public class Program {
    public static void main(String[] args) {
        App app = new App();
        Random random = new Random();
        HashMap<Integer,BlackJack> doors = app.getMap();
        Set<Integer> setFull = doors.keySet();
        Set<Integer> set1 = new HashSet<>();
        BlackJack[] door = app.getBox();
        int step1 = random.nextInt(0,3);
        System.out.println(step1);
        set1.add(step1);
        System.out.println(doors.get(step1));
        doors.remove(step1);

        //door[step1].open();
        Set<Integer> set2 = doors.keySet();
        Set<Integer> setRazn = new HashSet<>(setFull);
        setRazn.removeAll(set2);
        HashMap<Integer,BlackJack> doors2 = new HashMap<>();
        int count = 0;
        for (Integer item: setRazn) {
            doors2.put(count,doors.get(item));
            count++;
        }

        int step2 = random.nextInt(0,2);
        System.out.println(step2);
        set1.add(step2);
        System.out.println(doors2.get(step2));
        doors2.remove(step2);
        //door[step2].open();
        Set<Integer> set3 = doors2.keySet();
        System.out.println(set3);
        System.out.println(set3.removeAll(set1));
    }
}

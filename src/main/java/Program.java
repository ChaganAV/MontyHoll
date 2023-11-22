import java.util.*;

public class Program {
    public static void main(String[] args) {
        App app = new App();
        HashMap<Integer,Integer> mapResult = new HashMap<>();
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            result = app.startGame();
            mapResult.put(i,result);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>(mapResult.values());
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            //System.out.println(String.valueOf(arrayList.get(i)));
            sum+= arrayList.get(i);
        }
        System.out.println(String.format("На 1000 проб %d побед и %d поражений",sum, 1000-sum));
        //System.out.println(sum);
    }
}

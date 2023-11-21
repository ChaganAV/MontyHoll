import java.util.*;

public class App {
    private BlackJack[] box = new BlackJack[3];
    private Random random;

    public App(){
        this.random = new Random();
        initialize();
    }
    private void initialize(){
        Auto bmw = new Auto("BMW");
        Goat goat = new Goat("Маша");
        //Goat goat2 = new Goat(0,"Муся");
        Map<Integer,BlackJack> map = new HashMap<>();
        map.put(0,goat);
        map.put(1,bmw);
        map.put(2,goat);
        Set<Integer> setFull = map.keySet();
        
        int step1 = random.nextInt(0,3);
        box[0] = map.get(step1);
        map.remove(step1);
        Map<Integer,BlackJack> map2 = new HashMap<>();

        box[1] = map.get(random.nextInt(0,2));
        if(box[0].equals(box[1])){
            box[2] = bmw;
        }else {
            box[2] = goat;
        }

    }
    public HashMap<Integer,BlackJack> getMap(){
        HashMap<Integer,BlackJack> map = new HashMap<>();
        for (int i = 0; i < box.length; i++) {
            map.put(i,box[i]);
        }
        return map;
    }
    public BlackJack[] getBox() {
        return box;
    }

    public void setBox(BlackJack[] box) {
        this.box = box;
    }
}

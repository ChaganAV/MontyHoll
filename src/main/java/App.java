import java.util.*;

public class App {
    private BlackJack[] box = new BlackJack[3];
    private Map<Integer,Integer> mapResult = new HashMap<>();
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

        int step = random.nextInt(0,2);
        box[0] = map.get(step);
        if(step == 1){
            box[1] = goat;
            box[2] = goat;
        }else {
            step = random.nextInt(0,2);
            if(step == 1){
                box[1] = bmw;
                box[2] = goat;
            }else {
                box[1] = goat;
                box[2] = bmw;
            }

        }

    }
    public HashMap<Integer,Integer> getResult(){
        return (HashMap<Integer, Integer>) this.mapResult;
    }
    public int startGame(){
        Random random = new Random();
        int result = 0;
        int choice = random.nextInt(0,3);

        // ящик для оставшихся после первого выбора
        BlackJack[] box2 = new BlackJack[2];
        //
        switch (choice){
            case 0:
                box2[0] = box[choice];
                //System.out.println("Ведущий открыл дверь с козой ");
                if(box[choice+1].getCode() == 0){
                    //box[choice+1].open();
                    box2[1] = box[choice+2];
                }else {
                    //box[choice+2].open();
                    box2[1] = box[choice+1];
                }
                break;
            case 1:
                box2[0] = box[choice];
                //System.out.println("Ведущий открыл дверь с козой ");
                if(box[choice-1].getCode() == 0){
                    //box[choice-1].open();
                    box2[1] = box[choice+1];
                }else {
                    //box[choice+1].open();
                    box2[1] = box[choice-1];
                }
                break;
            default:
                box2[0] = box[choice];
                //System.out.println("Ведущий открыл дверь с козой ");
                if(box[choice-2].getCode() == 0){
                    //box[choice-2].open();
                    box2[1] = box[choice-1];
                }else {
                    //box[choice-1].open();
                    box2[1] = box[choice-2];
                }
                break;
        }
        // пользователь выбирает из оставшихся двух дверей
        choice = random.nextInt(0,2);
        //box2[choice].open();
        if(box2[choice].getCode() == 1){
            //System.out.println("угадал");
            result = 1;
        }
        return result;
    }
    public BlackJack[] getBox() {
        return box;
    }

    public void setBox(BlackJack[] box) {
        this.box = box;
    }
}

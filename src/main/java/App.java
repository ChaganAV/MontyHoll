import java.util.Random;

public class App {
    private BlackJack[] box = new BlackJack[3];
    private Random random;

    public App(){
        this.random = new Random();
        initialize();
    }
    private void initialize(){
        Auto bmw = new Auto(1,"BMW");
        Goat goat1 = new Goat(0,"Маша");
        Goat goat2 = new Goat(0,"Муся");
        int lotto = random.nextInt(0,2);
        if(lotto == 1) {
            box[0] = bmw;
            box[1] = goat1;
            box[2] = goat2;
        }else {
            box[0] = goat1;
            lotto = random.nextInt(0,2);
            if(lotto == 1){
                box[1] = bmw;
                box[2] = goat2;
            }else {
                box[1] = goat2;
                box[2] = bmw;
            }
        }
    }

}

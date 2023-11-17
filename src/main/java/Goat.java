public class Goat extends BlackJack{
    private String name;
    public Goat(int code,String name){
        super(code);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

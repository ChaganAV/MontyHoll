public class Goat implements BlackJack{
    private String name;
    public Goat(String name){
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goat{" +
                "name='" + name + '\'' +
                '}';
    }
}

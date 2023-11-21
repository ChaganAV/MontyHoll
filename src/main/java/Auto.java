public class Auto implements BlackJack{
    private String name;
    public Auto(String name){
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
        return "Auto{" +
                "name='" + name + '\'' +
                '}';
    }
}

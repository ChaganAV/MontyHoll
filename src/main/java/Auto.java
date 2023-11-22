public class Auto implements BlackJack{
    private int code;
    private String name;
    public Auto(String name){
        this.code = 1;
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
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                '}';
    }
}

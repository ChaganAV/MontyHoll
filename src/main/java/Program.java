public class Program {
    public static void main(String[] args) {
        App app = new App();
        int[] box = app.getBox();
        for (int i = 0; i < box.length; i++) {
            System.out.println(box[i]);
        }
    }
}

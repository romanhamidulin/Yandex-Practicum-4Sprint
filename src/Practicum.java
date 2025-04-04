public class Practicum {
    private int nonStaticVariable = 0;
    private static int staticVariable = 0;

    public void addTen() {
        nonStaticVariable += 10;
        staticVariable += 10;
    }

    public static void main(String[] args) {
        Practicum counter1 = new Practicum();
        counter1.addTen();

        Practicum counter2 = new Practicum();
    }
}

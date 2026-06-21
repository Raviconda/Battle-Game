public class Untoter extends Figur{
    static private int untoterzaehler = 1;

    public Untoter(String name) {
        super("Untoter" + untoterzaehler, 100, 50, 100);
        untoterzaehler++;
    }

    @Override
    public void angreifen() {
        System.out.println("Untoter schlägt zu");
    }
}

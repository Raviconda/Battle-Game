public class Bogenschütze extends Figur {
    public Bogenschütze(String name, double leben, double angriff, double Verteidigung) {
        super(name, 100, 75, 25);
    }

    @Override
    public void angreifen() {
        System.out.println(name + " spannt seinen Bogen und schießt");
    }
}

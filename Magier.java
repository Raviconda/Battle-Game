public class Magier extends Figur{

    public Magier(String name) {
        super(name, 80, 40, 4);
    }

    @Override
    public void angreifen() {
        System.out.println(name + "beschwört einen Feuerball");
    }
}

public class Heiler extends Figur implements Heilbar {

    private boolean feahigkeitgenutzt;

    public Heiler(String name) {
        super(name, 50, 20, 50);
    }

    @Override
    public void angreifen() {
        System.out.println(name + " greift an");
    }

    @Override
    public void heilen(int menge) {
        if (!feahigkeitgenutzt) {
            this.leben += menge;
            System.out.println(name + " nutzt heilbare magie unf heilt um " +menge+ "Punkte! Dein aktuelles Leben: "+leben);
            feahigkeitgenutzt = true;
        } else {
            System.out.println(name + "hat die magie bereits verbraucht" );
        }

    }

    public void resetMagie() {
        feahigkeitgenutzt = false;
    }
}


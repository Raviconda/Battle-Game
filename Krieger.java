import java.util.Scanner;

public class Krieger extends Figur {
    Scanner reader = new Scanner(System.in);
    public Krieger(String name) {
        super(name, 100, 50, 100);
    }

    @Override
    public void angreifen() {
        System.out.println("Krieger Aktionen:");
        System.out.println("(1)Schwerer Hieb \n(2)Schnelle Stiche\n(3)Verteidigung Aufbauen\n(4)Angriff aufladen");
        int auswahl = reader.nextInt();
        switch(auswahl){
            case 1:
                System.out.println(name + " führt einen schweren Hieb aus und ");
            case 2:
                System.out.println(name + " sticht schnell zu");
            case 3:
                System.out.println(name + " Verteidigung wird aufgeladen ");
            case 4:
                System.out.println(name + " Angriff wird aufgeladen");
            default: System.out.println("nö");
        }
    }
}

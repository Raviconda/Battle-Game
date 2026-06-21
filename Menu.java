import java.util.Scanner;

public class Menu {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen im Menu, Entscheide dich für ein Spiel");
        System.out.println("(1) 1 vs 1, Kämpfe gegen einen Freund um die Ehre (Zweispieler)\n(2) Wellenspiel(Einzelspieler)\n(3) Ertelle ein Team und kämpfe gegen andere Teams(Zweispieler)\n(4) Abbrechen");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Spieler 1 erstelle ein Namen");
                String spieler1 = sc.nextLine();
                System.out.println("Spieler 2 erstelle ein Namen");
                String spieler2 = sc.nextLine();

                String namenWahl;
                System.out.println(spieler1 + " wähle deine Klasse aus!");
                System.out.println("(1) Krieger  100HP / 50AD / 100DP");
                System.out.println("(2) Magier   200HP / 2AP  / 50DP");
                System.out.println("(3) Heiler    50HP / 20AD / 50DP");

                int auswahl = sc.nextInt();
                sc.nextLine();

                namenWahl = spieler1;
                switch (auswahl) {
                    case 1:
                        Krieger krieger = new Krieger(namenWahl);
                        break;
                    case 2:
                        Magier magier = new Magier(namenWahl);
                        break;
                    case 3:
                        Heiler heiler = new Heiler(namenWahl);
                        break;
                    default:
                        System.out.println("Fehler!");
                        break;
                }
                System.out.println(spieler1 + " wähle deine Klasse aus!");
                System.out.println("(1) Krieger  100HP / 50AD / 100DP");
                System.out.println("(2) Magier   200HP / 2AP  / 50DP");
                System.out.println("(3) Heiler    50HP / 20AD / 50DP");

                auswahl = sc.nextInt();
                sc.nextLine();

                namenWahl = spieler2;
                switch (auswahl) {
                    case 1:
                        Krieger krieger = new Krieger(namenWahl);
                        break;
                    case 2:
                        Magier magier = new Magier(namenWahl);
                        break;
                    case 3:
                        Heiler heiler = new Heiler(namenWahl);
                        break;
                    default:
                        System.out.println("Fehler!");
                        break;
                }
        }
    }

    public void spiel1vs1(){
        System.out.println("ja");
    }
    public void spielWellen(){
        System.out.println("ja");
    }
    public void spielTeamKampf(){
        System.out.println("ja");
    }
}

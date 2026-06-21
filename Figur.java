public abstract class Figur{
    protected String name;
    protected double leben;
    protected double angriff;
    protected double Verteidigung;

    public Figur (String name,double leben,double angriff,double Verteidigung){
        this.name = name;
        this.leben = leben;
        this.angriff = angriff;
        this.Verteidigung = Verteidigung;
    }

    public abstract void angreifen();

}

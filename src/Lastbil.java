public class Lastbil extends Vägfordon
{

    private double lastKapacitet;
    private int sittPlatser;

    public Lastbil(String reg_nr, String färg, String ägare, double vikt, double lastKapacitet, int sittplatser2) 
    {
        super(reg_nr, färg, ägare, vikt);
        this.lastKapacitet = lastKapacitet;
        this.sittPlatser = sittplatser2;
    }

    @Override
    public String toString()
    {
        return super.toString()+ "\nLastkapacitet: " + lastKapacitet + "kg" + "\nSittplatser: " + sittPlatser;
    }
    
}

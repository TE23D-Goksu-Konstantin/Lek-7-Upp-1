public class Lastbil extends Vägfordon
{

    private double lastKapacitet;

    public Lastbil(String reg_nr, String färg, String ägare, double vikt, double lastKapacitet) 
    {
        super(reg_nr, färg, ägare, vikt);
        this.lastKapacitet = lastKapacitet;
    }

    @Override
    public String toString()
    {
        return super.toString()+ "\nSittplatser" + lastKapacitet;
    }
    
}

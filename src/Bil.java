public class Bil extends Vägfordon
{
    
    private int sittPlatser;
    
    public Bil(String reg_nr, String färg, String ägare, double vikt, int sittplatser2)
    {
        super(reg_nr, färg, ägare, vikt);
        this.sittPlatser = sittplatser2;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+ "\nSittplatser: " + sittPlatser;
    }
    
}

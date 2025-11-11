public class Vägfordon
{
    
protected String reg_nr;
protected String färg; 
protected String ägare;
protected double vikt;


    public Vägfordon(String reg_nr, String färg, String ägare, double vikt)
    {
        setReg_nr(reg_nr);
        this.färg = färg;
        this.ägare = ägare;
        this.vikt = vikt;
    }




    public String getReg_nr()
    {
        return this.reg_nr;
    }

        public String getFärg()
    {
        return this.färg;
    }

        public String getÄgare()
    {
        return this.ägare;
    }

    public double getVikt()
    {
        return this.vikt;
    }



    public void setReg_nr(String reg_nr)
    {
        if(reg_nr.matches("^[A-Za-z]{3}[0-9]{3}$"))
        {
            this.reg_nr = reg_nr;
        }
        else
        {
            System.out.println("Registreringsnumret är fel");
        }
    }

    @Override
    public String toString()
    {
        return "Registreringsnummer: " + reg_nr + "\nÄgare: " + ägare + "\nFärg: " + färg + "\nVikt: " + vikt + "kg";
    }
}

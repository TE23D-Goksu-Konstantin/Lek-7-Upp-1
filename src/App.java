import java.util.ArrayList;
import java.util.Scanner;
public class App 
{

    static ArrayList<Vägfordon> fordon = new ArrayList<Vägfordon>();

    public static void main(String[] args) throws Exception 
    {
        while(true)
        {

            Scanner tB = new Scanner(System.in);
            System.out.println("Tjenare mannen!\n1. Skapa bill\n2. Skapa lastbil\n3. Lista skapade fordon");
            
            String theDecisionString = tB.nextLine();
            int theDecisionInt = Integer.parseInt(theDecisionString);
            
            if(theDecisionInt == 1)
            {
                attribut(tB);
            }
            else if(theDecisionInt == 2)
            {
                
            }
            else if(theDecisionInt == 3)
            {
                listaFordon(tB);
            }
            else
            {
                
            }
        }
    }

    public static void attribut(Scanner tB)
    {
        System.out.println("Ägarens namn?");
        String ägare = tB.nextLine(); 

        System.out.println("Vilken färg?");
        String färg = tB.nextLine();

        System.out.println("Vad väger den? (kilogram)");
        double vikt;

        while(true)
        {
            try 
            {
                vikt = Double.parseDouble(tB.nextLine());
                break;
            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println("Fel");
            }
        
        }

        System.out.println("Vad är registreringsnumret?");
        String reg_nr;
        while(true)
        {
            reg_nr = tB.nextLine();
            if(reg_nr.matches("^[A-Za-z]{3}[0-9]{3}$"))
            {
                break;
            }
            else
            {
                System.out.println("Fel");
            }
        }

        System.out.println("Antal sittplatser?");
        int sittplatser;
        while(true)
        {
            try 
            {
                sittplatser = Integer.parseInt(tB.nextLine());
                break;
            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println("Fel");
            }
        
        }
        Bil nyBil = new Bil(reg_nr, färg, ägare, vikt, sittplatser);
        fordon.add(nyBil);

    }

    public static void listaFordon(Scanner tB)
    {
        if(fordon.isEmpty())
        {
            System.out.println("Listan är tom!");
        }
        else
        {
            System.out.println("\nFordon: ");
            for(Vägfordon e : fordon)
            {
                System.out.println("__________________");
                System.out.println(e);
            }
        }
    }

}

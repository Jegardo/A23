import java.text.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class MAIN {
   
    private static Foititis [] pinFoitites;
    
    public static void main(String args[]) {
        pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(17, "Πολυκάρπου Κλέων", 
                strToDate("10/10/1999"));
        pinFoitites[1] = new Foititis(17, "Γεωργίου Αριστέα", 
                strToDate("2/5/1998"));
        pinFoitites[2] = new Foititis(17, "Τσουκαλάς Ανδρόνικος", null);
        pinFoitites[3] = new Foititis(17, "Χυτήρης Οδυσσέας", 
                strToDate(" 26/2/1998"));
        pinFoitites[4] = new Foititis(17, "Bikos Nikos", 
                null);
        pinFoitites[5] = new Foititis(18, "Gewrgiou Faidwn",strToDate("10/08/2000"));
        pinFoitites[6] = new Foititis(18, "Filippou Danai",strToDate("06/12/1999"));
        pinFoitites[7] = new Foititis(18, "Stergiou Kalliopi",strToDate("16/07/1999"));
        pinFoitites[8] = new Foititis(18, "Alexandridis Savvas",strToDate("23/09/2000"));
        
        pinFoitites[2].setHmerom(strToDate("3/4/1998"));
        pinFoitites[4].setHmerom(strToDate("3/4/1998"));
        
        String[] splited =pinFoitites[1].getOnEp().split("\\s+");
        splited[1]="Αφροδίτη";
        String newOnEp=splited[0] + " " + splited[1];
        pinFoitites[1].setOnEp(newOnEp);
            
        emfanisiFoititwn(pinFoitites);
        
        System.out.println("\n"+"Menu anazhthshs:"+"\n"+"1) Αναζήτηση με Επώνυμο"+"\n"+"2) Αναζήτηση με έτος γέννησης"+"\n"+"3) Αναζήτηση με ΑΜ"+"\n"+"0) Εξοδος");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Vale ton arithmo pou epithimeis:");
        int choice= keyboard.nextInt();
        
        switch (choice)
        {
            case 0:
                System.out.println("Εξοδος");
                break;
            case 1:
                System.out.println("Αναζήτηση με Επώνυμο");
                anazitisiMeEpwnymo(pinFoitites);
                break;
            case 2:
                System.out.println("Αναζήτηση με έτος γέννησης");
                break;
            case 3:
                System.out.println("Αναζήτηση με ΑΜ");
                break;
            default:
                System.out.println("Λαθος επιλογη");
                break;
                
        }
    }
    
    static void anazitisiMeEpwnymo(Foititis[] pin)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dwse epwnymo:");
        String epwn= keyboard.next();
        for (int i=0; i<pin.length ; i++)
        {
            if (pin[i]!=null)
            {
            
                String[] splited =pinFoitites[i].getOnEp().split("\\s+");
                if (epwn==splited[0])
                {
                    System.out.println("asdasdasd"+pin[i]);
                    i=pin.length;
                }
            }
            
        }
    }
    
    static void emfanisiFoititwn(Foititis[] pin)
    {
       for (int i=0; i<pin.length; i++)
        {
            if (pin[i]!=null)
            {  
                System.out.println(pin[i]);
            }
        } 
    }
    
    private static Date strToDate(String hmeromStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hmerom = null;
        try {
            hmerom = df.parse(hmeromStr);
        }
        catch (Exception ex ){
            System.out.println(ex);
        }
        return hmerom;
    }
    
    
    
}

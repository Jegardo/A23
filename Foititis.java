import java.util.Date;
import java.text.*;
//import MyDateLib.java;

public class Foititis {
    
    private static int auxwnArithmos = 0;
    private String AM;
    private String onomatEpwnymo;
    private Date hmeromGennisis;
    
    public Foititis(int etos, String onomatEpwnymo, Date hmeromGennisis) {
        auxwnArithmos+=1;
        // Δημιουργία αριθμού 3 ψηφίων
        DecimalFormat myFormatter = new DecimalFormat("000");
        String tempArithm = myFormatter.format(auxwnArithmos);
        this.AM= (etos + tempArithm); 
        this.onomatEpwnymo = onomatEpwnymo;
        this.hmeromGennisis = hmeromGennisis;
    }
        
    public String toString() {
        StringBuffer sb = new StringBuffer(this.AM + " ");
        sb.append(this.onomatEpwnymo + " ");
        sb.append(dateToStr(this.hmeromGennisis));
        return sb.toString();
    }
    
    private String dateToStr(Date hmeromGennisis) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str = df.format(this.hmeromGennisis);
        return str;
    }
    
    String getAM()
    {
        return this.AM;
    }
    
    String getOnEp()
    {
        return this.onomatEpwnymo;
    }
    
    Date getHmerom()
    {
        return this.hmeromGennisis;
    }

    public void setHmerom(Date hmerom)
    {
        this.hmeromGennisis=hmerom;
    }
    
     public void setOnEp(String OnEp)
    {
        this.onomatEpwnymo=OnEp;
    }     
}

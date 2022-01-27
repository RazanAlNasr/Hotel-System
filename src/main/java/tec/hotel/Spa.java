
public class Spa extends Service {

 private String serviceType;
    private int duration;
    private static int SpaPrice;
    
    public static final double MASSAGE_45 = 100.00;
     public static final double MASSAGE_30 = 50.00;
      public static final double MASSAGE_50 = 150.00;
    public static final double SAUNA_30 = 70.00;
    public static final double SAUNA_45 = 120.00;
    public static final double SAUNA_50 = 130.00;
    public static final double BODY_TREATMENT_30 = 110.00;
     public static final double BODY_TREATMENT_45 = 200.00;
      public static final double BODY_TREATMENT_50 = 250.00;

    public Spa(String serviceType, int duration) {
        this.serviceType = serviceType;
        this.duration = duration;
    }
    
    // Method Which Calculate the  total spa Price.
   public static int getTotalPrice(String serviceType, int duration)
   {
       if(serviceType.equalsIgnoreCase("MASSAGE")&& duration==45){
          SpaPrice =(int)(MASSAGE_45);
       }
        else if(serviceType.equalsIgnoreCase("MASSAGE")&& duration==30){
          SpaPrice =(int)(MASSAGE_30);
       }
          if(serviceType.equalsIgnoreCase("MASSAGE")&& duration==50){
          SpaPrice =(int)(MASSAGE_50);
       }
       else if(serviceType.equalsIgnoreCase("SAUNA")&& duration==30)
       {
           SpaPrice =(int)(SAUNA_30);
       }
         else if(serviceType.equalsIgnoreCase("SAUNA")&& duration==45)
       {
           SpaPrice =(int)(SAUNA_45);
       }
       
         else if(serviceType.equalsIgnoreCase("SAUNA")&& duration==50)
       {
           SpaPrice =(int)(SAUNA_50);
       }
       else if(serviceType.equalsIgnoreCase("BODY_TREATMENT")&& duration==30)
       {
          SpaPrice =(int)(BODY_TREATMENT_30);
       }
            else if(serviceType.equalsIgnoreCase("BODY_TREATMENT")&& duration==45)
       {
          SpaPrice =(int)(BODY_TREATMENT_45);
       }
            else if(serviceType.equalsIgnoreCase("BODY_TREATMENT")&& duration==50)
       {
          SpaPrice =(int)(BODY_TREATMENT_50);
       }
       return SpaPrice;
   }

    public String getServiceType() {
        return serviceType;
    }

    public int getDuration() {
        return duration;
    }

    public double getSpaPrice() {
        return SpaPrice;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String str = "";
        str += "Service Type: " + serviceType + "\nDuration: " + duration + "\nSpa Price: " + SpaPrice;
        return str;
    }

}

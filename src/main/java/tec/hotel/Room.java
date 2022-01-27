

public class Room extends Service {

public String roomType;
public int roomNo;
public boolean availability;
int roomPrice;
private int days;
private static int totalRoomPrice;

   
public static final double SINGLE=90.00;
public static final double DOUBLE=120.00;
public static final double SUITE=200.00;

Room(String roomType, int roomPrice, int roomNo) {
this.roomType = roomType;
this. roomPrice = roomPrice;
this.roomNo = roomNo;
this.availability=true;
    }

// Method Which Calculate the  total Room Price.
   public static int getTotalPrice(String roomType, int days)
   {
       if(roomType.equalsIgnoreCase("Single"))
       {
       totalRoomPrice=(int) (days*SINGLE);
       }
       else if(roomType.equalsIgnoreCase("Double"))
       {
           totalRoomPrice=(int) (days*DOUBLE);
       }
       else if(roomType.equalsIgnoreCase("Suite"))
       {
          totalRoomPrice=(int) (days*SUITE);
       }
       return totalRoomPrice;
   }
      
public void setAvailability (boolean availability){
this.availability= availability;
}

public boolean getAvailability (){
    return availability;
}

   
public void displayDetails(){
System.out.println(toString());

} 

@Override
    public String toString() {
        String str = "";
        str += "\n Room Type: " + roomType + "\nroom Price: " + roomPrice + "\nroomNo: " + roomNo
                + "\n availability: " + availability;
        return str;
    }



 public int getDays() {
       return days;
   }
 public void setDays(int days) {
       this.days = days;
   } 
 


public void setRoomNo (int roomNo){
        this.roomNo = roomNo;

    }

public int getRoomNo(){
            return roomNo;
    }


}








		




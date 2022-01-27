import java.util.Scanner;

public class Admin extends User {
    private int id;
    

      
     public Admin (String name, int age,String UserName, String password, int id){
     super(name, age  , UserName ,password);
   
    this.id = id;
    }
     
  
       public int getId() {
        return id;
        }
       
      public void setId(int id) {
    this.id=id;
        }
      
      
    public static void updateRoomPrice(String roomType, double pricePerDay){
        
    }
    
//    public static void DeleteRoom (int deleteRoom, Room rooms[]) {
//        
//     System.out.println(rooms[i]);
//      
//    for (int j = deleteRoom - 1 ; j<rooms.length; j++){
//     rooms[j]=rooms[j+1];
//   
//    }
//    for (int i=0;i<rooms.length ;i++)
//    System.out.println(rooms[i]);
        
   
    
     public static void addRoom (int roomNo, String roomType){
         
     }
     
     public static void changeRoomAvailability ( int roomType, int Availability){
         
         
     }
}

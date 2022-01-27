public class employee extends User {
    private int id;
    private String position;
    
    public employee (String name, int age, String UserName, String password, int id, String position){
    super(name, age  , UserName ,password);
   
    this.id = id;
    this.position=position ;
    }
    

    
    
 public void setPosition (String position){
      this.position=position ;
}

public String getPosition(){
return position ;
}
   
    public void setId (int id){
      this.id=id ;
}

public int getId(){
return id ;
}


 
     public static void changeRoomAvailability ( int roomType, int Availability){
         
     }
       
     public static void changeTableAvailability ( int TableNumber, int Availability ){
          
             
         
     } 
     
//     public void setPosition (position ){
//         this.position=position;
//     }
         
//     public addCustomer(String firstName,String lastName,String email,String phoneNum,String id){
//         this.firstName=firstName;
//         this.lastName=lastName;
//         this.phoneNum=phoneNum;
//         this.email=email;        
//         this.id=id;
//         
//     }
         
     
     
    
//         }
         
    

}
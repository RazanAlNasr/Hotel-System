import java.util.ArrayList;
import java.util.Scanner;
public class Customer extends User{ 
private String phoneNum;
private Service [] services;
Scanner input= new Scanner (System.in);

 public Customer (String name, int age, String UserName, String password, String phoneNum){
    super(name, age , UserName ,password);
   this.phoneNum=phoneNum;
    
    }
public void bookRoom(){
//
//System.out.print(" choose room number (1-10)");
//int roomNo =input.nextInt()-1;
//
//System.out.print("Enter Room Type: SINGLE , DOUBLE , SUITE ");
//String roomType=(input.next());
//services[roomNo]=roomType;
//
//System.out.print("Enter number of days you want to stay");
//int days= input.nextInt();
//services[roomNo]=days;
//
//System.out.print("Enter check in date");
//String CheckInDate= input.next();
//services[roomNo]=CheckInDate;
//
//System.out.print("Enter check out date");
//String CheckOutDate= input.next();
//services[roomNo]=CheckOutDate;
}

public void bookTable(){
//System.out.print("Enter table number");
//int tableNo= input.nextInt();
//services[roomNo]=tableNo;
//
//System.out.print("Enter number of chairs");
//int numOfChairs= input.nextInt();
//services[roomNo]=numOfChairs;
}

public void bookSpa(){
//System.out.print("Enter service type");
//String servicesType= input.next();
//services[roomNo]=servicesType;
//
//System.out.print("Enter duration");
//int duration= input.nextInt();
//services[roomNo]=duration;
//
//System.out.print("Enter oppointment date");
//String oppointmentDate= input.next();
//services[roomNo]=oppointmentDate;
//
//System.out.print("Enter oppointment time");
//String oppointmentTime= input.next();
//services[roomNo]=oppointmentTime;
}



public void searchRoom(String type){
      
//        for (int i=0;i<services.length;i++)
//        {   
//           if (services[i].getroomType().equals(RoomType))
//               System.out.print(i);
//        }
       
}
public void searchTable(String type){      
//        for (int i=0;i<services.length;i++)
//        {   
//           if (services[i].gettableNo().equals(TableNo))
//               System.out.print(i);
//        }
      
}

public void searchSpa(String type){
       
//        for (int i=0;i<services.length;i++)
//        {   
//           if (services[i].getServiceType().equals(ServiceType))
//              System.out.print(i);
//        }
       
}

public void bill(){

}
    }
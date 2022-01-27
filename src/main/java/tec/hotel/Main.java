
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    
    
    private static boolean MainMenu = true;
    private static boolean SubMenu = true;
    
    
    public static void main(String[] args){
        //creat rooms
        
        ArrayList <Room> rooms = new ArrayList<Room>();
       
        
        Room room1 = new Room ("SINGLE", 90,1);
        Room room2 = new Room ("SINGLE", 90,2); 
        Room room3 = new Room ("SINGLE", 90,3);
        Room room4 = new Room ("SINGLE", 90,4);
        Room room5 = new Room ("SINGLE", 90,5); 
          
        Room room6 = new Room ("DOUBLE", 120,6); 
        Room room7 = new Room ("DOUBLE", 120,7);
        Room room8 = new Room ("DOUBLE", 120,8); 
        Room room9 = new Room ("DOUBLE", 120,9);
        Room room10 = new Room ("DOUBLE", 120,10);
          
        Room room11 = new Room ("SUITE", 200,11); 
        Room room12 = new Room ("SUITE", 200,12);
        Room room13 = new Room ("SUITE", 200,13); 
        Room room14 = new Room ("SUITE", 200,14);
        Room room15 = new Room ("SUITE", 200,15);
        
       rooms.add(room1);
       rooms.add(room2);
       rooms.add(room3);
       rooms.add(room4);
       rooms.add(room5);
       rooms.add(room6); 
       rooms.add(room7);
       rooms.add(room8);
       rooms.add(room9); 
       rooms.add(room10);
       rooms.add(room11);
       rooms.add(room12);
       rooms.add(room13);
       rooms.add(room14);
       rooms.add(room15); 
       
        //creat Tables
        
        ArrayList <Table> tables = new ArrayList<Table>();
        
        Table table1 = new Table(1,2);
        Table table2 = new Table(2,2);
        Table table3 = new Table(3,4);
        Table table4 = new Table(4,4);
        Table table5 = new Table(5,6);
        Table table6 = new Table(6,6);
        
        tables.add(table1);
        tables.add(table2);
        tables.add(table3);
        tables.add(table4);
        tables.add(table5);
        tables.add(table6);
        
        //creat admin 
        Admin admin = new Admin ("Razan", 20, "Admin11", "adminPas", 11123);

        //creat Spa services
        
         ArrayList <Spa> spa = new ArrayList<Spa>();
        Spa spa1= new Spa("MASSAGE",30);
        Spa spa2= new Spa("MASSAGE",45);
        Spa spa3= new Spa("MASSAGE",50);
        Spa spa4= new Spa("SAUNA",30);
        Spa spa5= new Spa("SAUNA",45);
        Spa spa6= new Spa("SAUNA",50);
        Spa spa7= new Spa("BODY_TREATMENT",30);
        Spa spa8= new Spa("BODY_TREATMENT",45);
        Spa spa9= new Spa("BODY_TREATMENT",50);
        
        
        spa.add(spa1);
        spa.add(spa2);
        spa.add(spa3);
        spa.add(spa4);
        spa.add(spa5);
        spa.add(spa6);
        spa.add(spa7);
        spa.add(spa8);
        spa.add(spa9);
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("------------------------------------------------------");
        System.out.println(" Enter your Username: ");
        String userName=input.next();
        System.out.println(" Enter your Password: ");
        String password=input.next();

       
        while(MainMenu) {
            while(SubMenu) {
                
                System.out.println("------------------------------------------------------");
                System.out.println("              Welcome to our Hotel Program            ");
                System.out.println("------------------------------------------------------");
                System.out.println("Please select one of the options.");
                System.out.println("1: Admin menu.");
                System.out.println("------------------------------------------------------");
                System.out.println("2: Guest menu.");
                System.out.println("------------------------------------------------------");
                System.out.println("3: Employee menu.");
                System.out.println("------------------------------------------------------");
                int Selection = input.nextInt();
               
                switch (Selection) {
                    case 1: 
               if(admin.getPassword().equals(password) && admin.getUserName().equals(userName)){               
                   adminMenu();
                   int aChoice;
                   
                   do {
                       aChoice = input.nextInt();
                       switch(aChoice){
                           case 1:          //delete room 
                                int f=0;
                                do{
                                     System.out.println(" enter room number to delete "); 
                                     int deleteRoom = input.nextInt();
//                                     Admin.DeleteRoom(deleteRoom, rooms);
                                    
                                    
                                    
                                    
                                System.out.println("enter 1 to update another room, 0 to exit ");
                                f = input.nextInt();  

                                } while(f==1);
                                
                                break;
                                
                                
                            case 2: //update room price 
                                
                                
                                
                                
                                
                                
                                
                                
                                break;
                                
                            case 3: //Change Room Availability
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                break;
                            case 4: // add room 
                                
                                break;
                                
                                 default: System.out.print("Invalid Option, try again: ");
                       }
                   } while((aChoice>9)||(aChoice<0));
                        
               }
               else
                   System.out.println("Invalid entry");
               
                        
                        break;
                    case 2:
                        customerMenu();
                        int cChoice;
                   do {
                        cChoice = input.nextInt();
                        switch(cChoice){
                           case 1:
                               int x=0;
                               do{
                                    System.out.println("Enter the number of chairs: (2,4,6) ");
                                    int searchTable = input.nextInt();
                                    
                                    System.out.println(" choose table number from "  );
                                    for (Table R : tables){                                        
                                        if (R.numOfChairs>=searchTable){
                                        if(R.availavle==true)
                                        System.out.println("Table no. "+ R.tableNo +"  Number Of Chairs :" + R.numOfChairs );
                                        }
                                    }                                    
                                    int TableSelection =input.nextInt(); // change it availability 
                                    int y = TableSelection-1;                                    
                                    tables.get(y).availavle=false;
                                    
                                    System.out.print("The Table bill: ");
                                    double totalPrice = Table.getBill();
                                    System.out.println(totalPrice+"$");
                                                               
                                    System.out.println("enter 1 to book another table ");
                                    x = input.nextInt();  
                               }    while(x==1);
                            break;
                           
                           
                           case 2:
                               int a=0;
                               do{
                                    System.out.println("Enter Room Type: (SINGLE , DOUBLE , SUITE) ");
                                    String searchRoomType= input.next().toUpperCase();
                                    
                                    System.out.println("How Many Days Do you want to stay? ");
                                    int days=input.nextInt();
                                    
                                    System.out.println(" choose room number from "  );
                                    for (Room R : rooms){
                                        
                                        if (R.roomType.equals(searchRoomType)){
                                            if(R.availability==true)
                                        System.out.println("Room type: "+ R.roomType + "  Room price: " + R.roomPrice + "  Room No. :" + R.roomNo );
                                        }
                                    }                                    
                                    int RoomSelection =input.nextInt(); // change it availability 
                                    int y = RoomSelection-1;
                                    rooms.get(y).availability=false;
                                    
                                    System.out.print("The room bill: ");
                                    int totalPrice = (int)Room.getTotalPrice(searchRoomType, days);
                                    System.out.println(totalPrice+"$");
                                    
                                    System.out.println("enter 1 to book another room ");
                                    a = input.nextInt();  
                               }while(a==1);
                               
                            break;
                           case 3:
                                int b=0;
                               do{
                               System.out.println("Enter Spa Type: (MASSAGE , SAUNA , BODY_TREATMENT) ");
                               String searchServiceType= input.next().toUpperCase();
                               System.out.println(" Enter duration "  );
                                for (Spa H : spa){
                                        
                                        if (H.getServiceType().equals(searchServiceType)){
                                          
                                        System.out.println("Spa type: "+ H.getServiceType() + " Spa duration : " + H.getDuration());
                                        }   
                                    } 
                               int d= input.nextInt();
                               System.out.print("The Spa bill: ");
                                    int totalPricee = Spa.getTotalPrice(searchServiceType,d);
                                    System.out.println(totalPricee+"$");
                                    
                                    System.out.println("enter 1 to book another spa ");
                                    b = input.nextInt();  
                               
                               }while(b==1);
                               
                            break;
                           case 4:
                            break;
                           default: System.out.print("Invalid Option, try again: ");
                        }
                    }while((cChoice>4)||(cChoice<0));
                        break;
                    case 3:
                     
                        break;
                    default:
                        System.out.println("Invalid Selection");
                        break;
                }
                
               
                System.out.println("-----------------------------------------------------");
                
                System.out.println("Would you like to Select another Option\n1 ) Yes\n2 ) No");
                
               System.out.println("------------------------------------------------------");
             
                if (input.nextInt() == 1) {
                    SubMenu = true;
                } else {
                    SubMenu = false;
                }
            }
            SubMenu = true;
            System.out.println("------------------------------------------------------");
            
            System.out.println("Would You Like To Continue With The Program\n 1) Yes\n 2) No");
            
           System.out.println("------------------------------------------------------");
            if (input.nextInt() == 1) {
                MainMenu = true;
            } else {
                System.out.println("");
                System.exit(0);

            }
        }
    }
    public static void customerMenu(){
        System.out.println("choose option: ");
        System.out.println("1. Book Table");
        System.out.println("2. Book Room");
        System.out.println("3. Book Spa Apointment");
        System.out.println("4. Get the bill");
        System.out.print("Your choice: ");
    }
    
     public static void adminMenu(){
        System.out.println("choose option: ");
        System.out.println("1. Change Room Availability ");
        System.out.println("2. Add Room ");
        System.out.println("------------------------------------------------------");
        System.out.println("3. Add Table ");
        System.out.println("4. Change Table Availability  ");
        System.out.println("------------------------------------------------------");
        System.out.println("5. Add Spa Service ");
        System.out.println("6. Delete Spa Service ");

        
    }
}
/*
    public static void main(String[] args) {
        Room room1 = new Room ("SINGLE", 90,1);
        Room room2 = new Room ("SINGLE", 90,2); 
        Room room3 = new Room ("SINGLE", 90,3);
        Room room4 = new Room ("SINGLE", 90,4);
        Room room5 = new Room ("SINGLE", 90,5); 
          
        Room room6 = new Room ("DOUBLE", 120,6); 
        Room room7 = new Room ("DOUBLE", 120,7);
        Room room8 = new Room ("DOUBLE", 120,8); 
        Room room9 = new Room ("DOUBLE", 120,9);
        Room room10 = new Room ("DOUBLE", 120,10);
          
        Room room11 = new Room ("SUITE", 200,11); 
        Room room12 = new Room ("SUITE", 200,12);
        Room room13 = new Room ("SUITE", 200,13); 
        Room room14 = new Room ("SUITE", 200,14);
        Room room15 = new Room ("SUITE", 200,15);
        
        Room[] rooms = {room1,room2,room6,room7,room11,room12};
        
        System.out.println("Hotel Management System : on");
        System.out.println("Choose option: ");
        System.out.println("1. Admin");
        System.out.println("2. Employee");
        System.out.println("3. Costomer");
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            choice = in.nextInt();
            switch (choice){
               case 1: 
                   System.out.println("Admin : on");
                   adminMenu();
                   int aChoice;
                   do {
                        aChoice = in.nextInt();
                        switch(aChoice){
                           case 1:
                            break;
                           case 2: 
                            break;
                           case 3:
                            break;
                           case 4:
                            break;
                           default: System.out.print("Invalid Option, try again: ");
                        }
                    }while((aChoice>4)||(aChoice<0));
                break;
            
               case 2:
                    System.out.println("Employee : on");
                    employeeMenu();
                    int eChoice;
                   do {
                        eChoice = in.nextInt();
                        switch(eChoice){
                           case 1:
                            break;
                           case 2: 
                            break;
                           case 3:
                            break;
                           case 4:
                            break;
                           default: System.out.print("Invalid Option, try again: ");
                        }
                    }while((eChoice>4)||(eChoice<0));
                break;
            
               case 3:
                   System.out.println("Costomer : on");
                   customerMenu();
                   int cChoice;
                   do {
                        cChoice = in.nextInt();
                        switch(cChoice){
                           case 1:
                               int x=0;
                               do{
                                    System.out.println("Enter Room Type: (SINGLE , DOUBLE , SUITE) ");
                                    String searchRoomType= in.next().toUpperCase();
                                    
                                    System.out.println("How Many Days Do you want to stay? ");
                                    int days=in.nextInt();
                                    
                                    System.out.println(" choose room number from "  );
                                    for (Room R : rooms){
                                        if (R.roomType.equals(searchRoomType)){
                                        System.out.println("Room type: "+ R.roomType + "  Room price: " + R.roomPrice + "  Room No. :" + R.roomNo );
                                        }
                                    }                                    
                                    int RoomSelection =in.nextInt(); // change it availability 
                                    int y = RoomSelection-1;
                                    rooms[y].availability=false;
                                
                                
                                    System.out.println("enter 1 to book another room ");
                                    x = in.nextInt();  
                               }while(x==1);
                            break;
                           case 2:
                               
                               
                            break;
                           case 3:
                            break;
                           case 4:
                            break;
                           default: System.out.print("Invalid Option, try again: ");
                        }
                    }while((cChoice>4)||(cChoice<0));
                   break;
               
               default: System.out.print("Invalid Option, try again: ");
            }
        } while((choice>3)||(choice<1));

    }
    public static void adminMenu(){
        System.out.println("choose option: ");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.print("Your choice: ");
    }
    
    public static void employeeMenu(){
        System.out.println("choose option: ");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.print("Your choice: ");
    }
    
    public static void customerMenu(){
        System.out.println("choose option: ");
        System.out.println("1. Book Room");
        System.out.println("2. Book Table");
        System.out.println("3. Book Spa Apointment");
        System.out.println("4. Get the bill");
        System.out.print("Your choice: ");
    }
    
    
}
*/
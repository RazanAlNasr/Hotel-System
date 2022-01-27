
import java.util.Scanner;
public class Table extends Service{
    int tableNo, numOfChairs;
    boolean availavle;
    final static double PRICE_PER_CUSTOMER = 20;
    
    Table(int tableNo, int numOfChairs){
        this.tableNo = tableNo;
        this.numOfChairs = numOfChairs;
        availavle = true;
    }    
    public void setNumOfChairs(int numOfChairs){
        this.numOfChairs = numOfChairs;
    }   
    public void setAvailability(boolean Availability){
        this.availavle = Availability;
    }
    public void displayDetails(){
        System.out.println("Table No."+tableNo+" : "+availavle);
        if(availavle){
            System.out.println("Number Of Chairs: "+numOfChairs);
        }    
    }
    public static double getBill(){
        Scanner input = new Scanner(System.in);
        System.out.print("Customers Number: ");
        int numOfCustomer = input.nextInt();
        double price = numOfCustomer*PRICE_PER_CUSTOMER;
        return price;
    }
}


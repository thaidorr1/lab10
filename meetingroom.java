
package Bai10;

import java.util.Date;


public class meetingroom extends room {
    private int capacity ;

    public meetingroom(int capacity, String id, String name, double baseCost, Date checkin, Date checkout) {
        super(id, name, baseCost, checkin, checkout);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public double calculateCost () {
        long days = calculateDayStays () ;
        double total = days * baseCost ;
        if (getCapacity() > 50 ) {
            total = baseCost * 1.2 ;
        }
        return total ; 
    }
    @Override
    public void enterRoomInfor () {
        super.enterRoomInfor();
        System.out.println("enter capacity : "); capacity = input.nextInt() ;
    }
    @Override
    public void updateRoomById (String id ) {
        super.updateRoomById(id); 
        System.out.println("update capacity : " ); capacity = input.nextInt() ;
    }
    @Override
    public void displayDetails () {
       super.displayDetails();
        System.out.println("capacity is " + capacity );
    }
}


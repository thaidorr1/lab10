
package Bai10;

import java.util.Date;


public class bedroom extends room {
    private int numberOfBeds ;

    public bedroom(int numberOfBeds, String id, String name, double baseCost, Date checkin, Date checkout) {
        super(id, name, baseCost, checkin, checkout);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    @Override
    public double calculateCost () {
        long days = calculateDayStays () ;
        double total = days * baseCost ;
        if (getNumberOfBeds() > 3) {
            total += baseCost * 1.1 ;
        }
        return total ;
    }
    @Override
    public void enterRoomInfor () {
        super.enterRoomInfor();
        System.out.println("enter numberOfBeds "); numberOfBeds = input.nextInt() ;
    }
    @Override
    public void updateRoomById (String id ) {
        super.updateRoomById(id); 
        System.out.println("update numberOfBeds : "); numberOfBeds = input.nextInt() ;
    }
    @Override
    public void displayDetails () {
        super.displayDetails();
        System.out.println("numberOfBeds is : " + numberOfBeds );
    }
}


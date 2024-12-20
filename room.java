
package Bai10;

import java.text.ParseException;
import java.util.Date ;
import java.util.Scanner ;
import java.text.SimpleDateFormat ;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class room implements iroom {
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy") ;
    Scanner input = new Scanner (System.in) ;
    private String id , name ;
    double baseCost ;
    private Date checkin , checkout ;

    public room(String id, String name, double baseCost, Date checkin, Date checkout) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }
    
    
    
    @Override
    public abstract double calculateCost ();
    @Override
    public void enterRoomInfor () {
        System.out.println("enter id : "); id = input.nextLine() ;
        System.out.println("enter name : "); name = input.nextLine () ;
        System.out.println("enter baseCost : "); baseCost = input.nextDouble() ;
        System.out.println("enter checkin : "); input.nextLine() ; String checkinn = input.nextLine() ;
        System.out.println("enter checkout : "); String checkoutt = input.nextLine() ;
        try {
            checkin = sdf.parse(checkinn) ;
            checkout = sdf.parse(checkoutt) ;
        } catch (ParseException ex) {
            Logger.getLogger(room.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void updateRoomById (String id ) {
        if (this.id.equals(id)) {
            System.out.println("update id : "); id = input.nextLine() ;
            System.out.println("update name : "); name = input.nextLine() ;
            System.out.println("update baseCost : "); baseCost = input.nextDouble() ;
            System.out.println("update checkin : "); String updateCheckin = input.nextLine() ;
            System.out.println("update checkout : "); String updateCheckout = input.nextLine() ;
             try {
                sdf.parse(updateCheckin) ;
                sdf.parse(updateCheckout) ;
            } catch (ParseException ex) {
                Logger.getLogger(room.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override
    public void displayDetails () {
        System.out.println("id is : " + id);
        System.out.println("name is : " + name); 
        System.out.println("baseCost is : " + baseCost );
        System.out.println("checkin is : " + sdf.format(checkin));
        System.out.println("checkin is : " + sdf.format(checkout));
    }
    long calculateDayStays () {
        long millisecondsPerDay = 24 * 60 * 60 * 1000;
        long differenceInMilliseconds = checkout.getTime() - checkin.getTime();
        return differenceInMilliseconds / millisecondsPerDay;
    }
}


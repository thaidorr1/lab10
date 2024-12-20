
package Bai10;
import java.util.ArrayList ;

public class roomlist {
    ArrayList<room> a = new ArrayList<> () ;
    public void add (room b) {
        a.add(b) ;
    }
    public void updateRoomById (String id ) {
        for (room x : a) {
            if (x.getId().equals(id)) {
                x.updateRoomById(id);
            }
        }
    }
    void deleteRoomById (String id ) {
        for (room x : a ) {
            if (x.getId().equals(id)) {
                a.remove(x) ;
            }
        }
    }
    void findRoomById (String id ) {
        for (room x : a ) {
            if (x.getId().equals(id)) {
                x.displayDetails();
            }
        }
    }
    void displayAllRooms () {
        for(room x : a) {
            x.displayDetails();
        }
    }
    public room findmostexpensiveroom () {
        room mostroom = a.get(0) ;
        for (room x : a ) {
            if (x != null && x.getBaseCost() > mostroom.getBaseCost() ) {
                mostroom = x ;
            }
        }
        return mostroom ;
    }
    public void countrooms () {
        int meetingroom = 0  , bedroom = 0  ;
        for (room x : a ) {
            if (x instanceof meetingroom ) {
                ++meetingroom ;
            }
            else {
                ++bedroom ;
            }
        }
        System.out.println("count meetingroom is : " + meetingroom );
        System.out.println("count bedroom is : " + bedroom );
    }
}

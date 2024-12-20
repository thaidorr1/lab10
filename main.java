
package Bai10;

import static java.time.LocalDate.now;
import java.util.Scanner ;
import java.util.Date ;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        roomlist a = new roomlist () ;
        while (true) {
            System.out.println("1.Add a new meeting room");
            System.out.println("2.Add a new bedroom");
            System.out.println("3.Update Room by id");
            System.out.println("4.  Delete Room by id");
            System.out.println("5.Find Room by id");
            System.out.println("6.Display all Rooms");
            System.out.println("7.Find the most expensive Room");
            System.out.println("8.Count the total number of meeting room and bedroom separately in the\n" +
"RoomList.");
            System.out.println("enter choice : "); 
            int lc = input.nextInt() ;
            switch (lc) {
                case 1 : 
                    meetingroom me = new meetingroom (0 , "" , "" , 0  , new Date() , new Date ()  );
                    me.enterRoomInfor();
                    a.add(me);
                case 2 : 
                    bedroom be = new bedroom (0 , "" , "" , 0  , new Date() , new Date ()  );
                    be.enterRoomInfor();
                    a.add(be);
                case 3 :
                    System.out.println("enter update : "); String update = input.nextLine() ;
                    a.updateRoomById(update); 
                case 4 :
                    System.out.println("enter delete id "); String delete = input.nextLine() ;
                    a.deleteRoomById(delete);
                case 5 :
                    System.out.println("enter find id : "); String find = input.nextLine () ;
                    a.findRoomById(find);
                case 6 :
                    System.out.println("----ROOMS--------");
                    a.displayAllRooms();
                case 7 :
                    System.out.println("most room ");
                    a.findmostexpensiveroom();
                case 8 :
                    a.countrooms();
            }
        }
    }
}

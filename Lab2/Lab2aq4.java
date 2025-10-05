// Student Name: Rachel O Shea
// Student ID: C00248457

public class Lab2aq4
{
        public static void main(String  args[])
        {

        HotelRoom2 roomA = new HotelRoom2();      //Create new instance of room called roomA
        HotelRoom2 roomB = new HotelRoom2();      // Second instance
        HotelRoom roomC = new HotelRoom(202, "Single", false, 90);

        roomA.setRoomNumber(200);           //Set room num using constructor 
        roomA.setRoomType("Single");        //Set room type using constructor
        roomA.setOccupied(true);            //Set room to be occupied - i.e. 1
        roomA.setRoomRate(100);     
        

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setOccupied(false);
        roomB.setRoomRate(80);

        System.out.println("Room A: " + roomA.getRoomNumber() + ", " + roomA.getRoomType() + ", " + roomA.isOccupied() + ", " + roomA.getRoomRate());
        System.out.println("Room B: " + roomB.getRoomNumber() + ", " + roomB.getRoomType() + ", " + roomB.isOccupied() + ", " + roomB.getRoomRate());
        System.out.println("Room C: " + roomC.getRoomNumber() + ", " + roomC.getRoomType() + ", " + roomC.isOccupied() + ", " + roomC.getRoomRate());

        //First attempt to occupy, already set to unoccupied by default
        if(!roomB.isOccupied())
        {
            roomB.setOccupied(true);
            System.out.println("Room B is now occupied.");
        }

        else
        {
            System.out.println("Room is already occupied, cannot double book.");
        }


        //Second attempt to occupy to test for double booking
        if(!roomB.isOccupied())
        {
            roomB.setOccupied(true);
            System.out.println("Room B: " + roomB.getRoomNumber() + ", " + roomB.getRoomType() + ", " + roomB.isOccupied() + ", " + roomB.getRoomRate());
        }

        else
        {
            System.out.println("Room B is already occupied, cannot double book.");
            //System.out.println("Room B: " + roomB.getRoomNumber() + ", " + roomB.getRoomType() + ", " + roomB.isOccupied() + ", " + roomB.getRoomRate());
            //Used this to test that room occupancy was changed to true
        }
    }
}
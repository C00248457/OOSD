// Student Name: Rachel O Shea
// Student ID: C00248457

public class Lab2aq1
{

    public static void main(String  args[])
    {

        HotelRoom roomA = new HotelRoom();      //Create new instance of room called roomA
        HotelRoom roomB = new HotelRoom();      // Second instance

        roomA.setRoomNumber(200);           //Set room num using constructor 
        roomA.setRoomType("Single");       //Set room type using constructor

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");


        System.out.println("Room A: " + roomA.getRoomNumber() + ", " + roomA.getRoomType());
        System.out.println("Room B: " + roomB.getRoomNumber() + ", " + roomB.getRoomType());
    }


}
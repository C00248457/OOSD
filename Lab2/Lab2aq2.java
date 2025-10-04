// Student Name: Rachel O Shea
// Student ID: C00248457

public class Lab2aq2 {
    
    public static void main(String  args[])
    {

        HotelRoom roomA = new HotelRoom();      //Create new instance of room called roomA
        HotelRoom roomB = new HotelRoom();      // Second instance

        roomA.setRoomNumber(200);           //Set room num using constructor 
        roomA.setRoomType("Single");        //Set room type using constructor
        roomA.setRoomVacancy(1);            //Set room to be occupied - i.e. 1
        roomA.setRoomRate(100);         

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setRoomVacancy(0);
        roomB.setRoomRate(80);

        System.out.println("Room A: " + roomA.getRoomNumber() + ", " + roomA.getRoomType() + ", " + roomA.getRoomVacancy() + ", " + roomA.getRoomRate());
        System.out.println("Room B: " + roomB.getRoomNumber() + ", " + roomB.getRoomType() + ", " + roomB.getRoomVacancy() + ", " + roomB.getRoomRate());


    }
}
//Student Name: Rachel O Shea
// Student ID: C00248457
//Lab 2 A Q1 - Hotelroom class
//Set it as HotelRoom2 so that it didn't remove previous setup of HotelRoom

public class HotelRoom2 {
    
    private int roomNumber;
    private String roomType;
    private double roomRate;
    private boolean roomOccupancy;

    public HotelRoom2()
    {
        setRoomNumber(0);
        setRoomType("Single");
        roomOccupancy = false; //Assign to be vacant by default
    }

    public HotelRoom2(int roomNumber, String roomType, boolean isOccupied, double rate)
    {
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setOccupied(isOccupied); //Room is vacant by default
        setRoomRate(rate);
    }

    public void setRoomNumber(int num)
    {
        roomNumber = num;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomType(String type)
    {
        if (type.equals("Single") || type.equals("Double"))
        {
            roomType = type;
            //Room type will default to single if anything other than single or double is entered, as that is set as the default
        }

        else 
        {
            System.out.println("Invalid room type! Must be single or double.");
            //Account for potential user error
        }

    }

    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomRate(double rate)
    {
        roomRate = rate;
    }

    public double getRoomRate()
    {
        return roomRate;
    }

    public void setOccupied(boolean isOccupied)
    {
           roomOccupancy = isOccupied;
    }

    public boolean isOccupied()
    {
        return roomOccupancy;
    }
}

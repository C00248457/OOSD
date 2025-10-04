//Student Name: Rachel O Shea
// Student ID: C00248457
//Lab 2 A Q1 - Hotelroom class

public class HotelRoom {
    
    private int roomNumber;
    private String roomType;
    private int roomVacancy;
    private double roomRate;

    public HotelRoom()
    {
        setRoomNumber(0);
        setRoomType("Single");
        setRoomVacancy(0);
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
        }

    }

    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomVacancy(int vacancy)
    {
        if(vacancy == 0 || vacancy == 1)
        {
            roomVacancy = vacancy;
        }

        else 
        {
            System.out.println("Room vacancy is not valid.");
        }
    }
    public int getRoomVacancy()
    {
        return roomVacancy;
    }

    public void setRoomRate(double rate)
    {
        roomRate = rate;
    }

    public double getRoomRate()
    {
        return roomRate;
    }
}

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class HotelImpl extends UnicastRemoteObject implements Hotel {

    HashMap<String, Integer> bookings;

    int roomNumber = 1;

    protected HotelImpl() throws RemoteException {

        bookings = new HashMap<>();

    }

    // Book room
    public String bookRoom(String guestName) throws RemoteException {

        if (bookings.containsKey(guestName)) {

            return "Guest already has a booking!";

        }

        bookings.put(guestName, roomNumber);

        return "Room booked for " + guestName +
               " Room No: " + (roomNumber++);

    }

    // Cancel booking
    public String cancelBooking(String guestName) throws RemoteException {

        if (!bookings.containsKey(guestName)) {

            return "No booking found!";

        }

        bookings.remove(guestName);

        return "Booking cancelled for " + guestName;

    }

    // View bookings
    public String viewBookings() throws RemoteException {

        if (bookings.isEmpty()) {

            return "No bookings available.";

        }

        String result = "Current Bookings:\n";

        for (String guest : bookings.keySet()) {

            result += guest +
                    " - Room No: " +
                    bookings.get(guest) + "\n";

        }

        return result;

    }
}
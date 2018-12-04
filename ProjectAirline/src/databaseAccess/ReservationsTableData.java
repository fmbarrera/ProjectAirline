package databaseAccess;

import Backend.ReservationsTable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class ReservationsTableData {
		
		private static Statement statement;
	    private static ObservableList<ReservationsTable> reservationsTableItems;
	    private static Connection conn = DBconnect.connect();

	    
	    public static ObservableList<ReservationsTable> getReservationsTableItems() {
	        reservationsTableItems = FXCollections.observableArrayList();

	        try{
	            statement = conn.createStatement();
	            ResultSet rs = statement.executeQuery("SELECT DepartingDate, DepartingCity, DepartingTime, ArrivalCity, ArrivalDate, FlightID " +
	                    "FROM flight f JOIN reservations r " +
	                    "ON f.flightID = r.flightID " +
	                    "JOIN user u " +
	                    "ON r.UserID = u.UserID " +
	                    "ORDER BY departure_date;");

	            if(rs!=null)
	                while(rs.next()){
	                    ReservationsTable b = new ReservationsTable();
	                    b.setDepartureDate(rs.getDate(1).toString());
	                    b.setRoute(rs.getString(2) + " -> " + rs.getString(3));
	                    b.setUser(rs.getString(4) + " " + rs.getString(5));
	                    b.setFlightNum(rs.getInt(6));

	                    reservationTableItems.add(b);
	                }
	        }

	        catch(Exception e){
	            e.printStackTrace();
	        }

	        return  reservationTableItems;
	    }

	}

}
package Frontend.SceneControl;

import Backend.*;
import databaseAccess.*;
import Frontend.GUI.*;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;

import java.sql.SQLException;
import java.time.LocalDate;

public class ViewFlightSceneControl {


    private static TableView<FlightTable> table;
    private static ObservableList<FlightTable> flights, tableItems;
    private static TextField search;
    private static Button backB, addB, editB, deleteFlightsB;


    public static void initialize(){

        table = ViewFlightsScene.getTable();
        try {
			table.setItems(FlightTableData.getFlightItems());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        backB = ViewFlightsScene.getBackB();
        backB.setOnAction(e -> handle_backB());
<<<<<<< HEAD
        
        addB = ViewFlightsScene.getAddB();
        addB.setOnAction(e -> handle_addB());

=======

 //       addB = ViewFlightsScene.getAddB();
 //       addB.setOnAction(e -> handle_addB());
        /*
>>>>>>> branch 'master' of https://github.com/fmbarrera/ProjectAirline.git
        editB = ViewFlightsScene.getEditB();
        //editB.setOnAction(e -> handle_editB());

        deleteFlightsB = ViewFlightsScene.getDeleteFlightsB();
        deleteFlightsB.setOnAction(event -> handle_deleteFlightsB());
*/

        search = ViewFlightsScene.getSearch();
        flights = table.getItems(); //set search arrayList items
        initializeSearch();

    }


<<<<<<< HEAD
    //add button action
    public static void handle_addB() {
        FlightTable flightTable = new FlightTable(LocalDate.now().toString());
        //Flight flight = new Flight();

        MainControl.showFlightEditScene();
/*
        if(okPressed) {
            flight = FlightEditSceneControl.getFlight();

            FlightData.insertFlight(flight); //add flight to database

            try {
				table.setItems(FlightTableData.getFlightItems());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //set the table items
            flights = table.getItems();
*/
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.initOwner(MainControl.getWindow());
            alert.setContentText("Flight added!");
            alert.showAndWait();
            System.out.println("new flight added");
        //}
    }


/*
    //edit button action
    public static void handle_editB(){
        FlightTable flightTable = table.getSelectionModel().getSelectedItem();
        Flight flight = new Flight();

        if(flightTable != null) {
            boolean okPressed = true;
            MainControl.showFlightEditScene();

            if (okPressed) {
                flight = FlightEditSceneControl.getFlight();
   //             FlightData.updateFlight(flight); //update flight in database

                try {
					table.setItems(FlightTableData.getFlightItems());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //set the table items
                flights = table.getItems();

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.initOwner(MainControl.getWindow());
                alert.setContentText("Flight edited!");
                alert.showAndWait();

                System.out.println("a flight edited");
            }
        }

        else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.initOwner(MainControl.getWindow());
                alert.setHeaderText("Select flight!");
                alert.setContentText("No flight selected!");
                alert.showAndWait();
            }

    }
*/

=======
>>>>>>> branch 'master' of https://github.com/fmbarrera/ProjectAirline.git
    //back button action
    public static void handle_backB(){ MainControl.showMenuScene(); }
  
    //delete button action
<<<<<<< HEAD
    public static void handle_deleteFlightsB() {
    	
    	ObservableList<FlightTable> selFlight;
    	ObservableList<FlightTable> allFlight;
=======
 /*   public static void handle_deleteFlightsB() {
>>>>>>> branch 'master' of https://github.com/fmbarrera/ProjectAirline.git
        
<<<<<<< HEAD
        allFlight = table.getItems();
        selFlight = table.getSelectionModel().getSelectedItems();
        //selFlight = table.getSelectionModel();
      
        selFlight.get(table.getSelectionModel().getSelectedIndex());
        //selFlight.get(table.getSelectionModel().getSelectedIndex());
        
        
        
        
        //selFlight.forEach(action);
        
        
        //FlightData.deleteFlight(FlightEditSceneControl.getFlight());
=======
        Flight.deleteFlight(FlightEditSceneControl.getFlight());
>>>>>>> branch 'master' of https://github.com/fmbarrera/ProjectAirline.git
    }
*/
    
    public static void initializeSearch(){
        search.textProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if (search.textProperty().get().isEmpty()) {
                    table.setItems(flights);
                    return;
                }

                tableItems = FXCollections.observableArrayList();

                for(FlightTable f : flights){
                    if(f.getDepartingCity().toUpperCase().contains(search.getText().toUpperCase()) ||
                            f.getArrivalCity().toUpperCase().contains(search.getText().toUpperCase())){
                        tableItems.add(f);
                    }
                }

                table.setItems(tableItems);
            }
        });
    }

}

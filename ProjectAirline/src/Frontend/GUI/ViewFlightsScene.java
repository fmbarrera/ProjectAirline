package Frontend.GUI;

//Change the red, add or change Table columns

import Backend.FlightTable;
import databaseAccess.FlightTableData;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ViewFlightsScene {

	/* To DO: 
	 * delete route
	 * need FlightID
	 * Departing City which is only ATL
	 * Departing Date
	 * Departing time  and delete arrival time
	 * Arrival City
	 * Arrival Date
	 * Price
	 * Seats remaining 	
	 */	
	
    //fields
    private static Pane layout;
    private static VBox layout2;
    private static Scene scene;
   
    //FOR TABLE
    private static TableView<FlightTable> table;
    private static TableColumn<FlightTable, Integer> flightIDColumn, seatsRemainingColumn;
    private static TableColumn<FlightTable, String> departingCityColumn, departingDateColumn, departingTimeColumn, arrivalCityColumn;
    private static TableColumn<FlightTable, Double> priceColumn;
    
    private static Label allFlightL;
    private static TextField search;
    private static HBox buttonLayout;
    private static Button backB, addB, deleteFlightsB;


    //initialization of objects
    public static void initialize() throws Exception {

        //table
        table = new TableView<>();
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.setMinSize(600,300);
        table.relocate(42,32);

        //initialize columns
        flightIDColumn = new TableColumn<FlightTable, Integer>("ID");
        flightIDColumn.setCellValueFactory(new PropertyValueFactory<>("FlightID"));

        departingCityColumn = new TableColumn<FlightTable, String>("Departing city");
        departingCityColumn.setCellValueFactory(new PropertyValueFactory<>("DepartingCity"));

        departingDateColumn = new TableColumn<FlightTable, String>("Departing date");
        departingDateColumn.setCellValueFactory(new PropertyValueFactory<>("DepartingDate"));
 
        departingTimeColumn = new TableColumn<FlightTable, String>("Departing time");
        departingTimeColumn.setCellValueFactory(new PropertyValueFactory<>("DepartingTime"));
        
        arrivalCityColumn = new TableColumn<FlightTable, String>("Arrival city");
        arrivalCityColumn.setCellValueFactory(new PropertyValueFactory<>("ArrivalCity"));

        priceColumn = new TableColumn<FlightTable, Double>("Basic price");
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("Price"));

        seatsRemainingColumn = new TableColumn<FlightTable, Integer>("Available seats");
        seatsRemainingColumn.setCellValueFactory(new PropertyValueFactory<>("SeatsRemaining"));

        table.getColumns().addAll(flightIDColumn, departingCityColumn, departingDateColumn, departingTimeColumn, arrivalCityColumn, priceColumn, seatsRemainingColumn);

               
        //search field
        search = new TextField();
        search.setPromptText("Search Flight ID");
        search.setMinWidth(150);
        search.relocate(42,642);

        //back butt
        backB = new Button("Back");

        //add butt
        addB = new Button("Add/Edit Flight...");
        addB.setMinWidth(100);

        //exportFlightsB
        deleteFlightsB = new Button("Delete");

        //button layout
        buttonLayout = new HBox(20);
        buttonLayout.setAlignment(Pos.CENTER);
        buttonLayout.getChildren().addAll(search,addB,deleteFlightsB,backB);
        
        allFlightL = new Label("\t\t\t\t\t\t\t\t\tHere you can see all flights available by Panther Airlines \n\t\t\t\t\t\t\t\t\t        ONLY ADMINS can add, edit, or delete a flight");
        allFlightL.setAlignment(Pos.CENTER);
        
        layout2 = new VBox(30);
        layout2.setPadding(new Insets(50, 50,50,50));
        layout2.getChildren().addAll(allFlightL,table, buttonLayout);
        
        //scene
        scene = new Scene(layout2, 1200, 700);
        scene.getStylesheets().add("/Frontend/GUI/style.css");

        System.out.println("flights scene initialized");
    }


    //getters
    public static Pane getLayout() {
        return layout;
    }

    public static Scene getScene() {
        return scene;
    }

    public static TableView<FlightTable> getTable() {
        return table;
    }

    public static TableColumn<FlightTable, Integer> getFlightIDColumn() {
        return flightIDColumn;
    }

    public static TableColumn<FlightTable, Integer> getSeatsRemainingColumn() {
        return seatsRemainingColumn;
    }

    public static TableColumn<FlightTable, String> getDepartingDateColumn() {
        return departingDateColumn;
    }

    public static TableColumn<FlightTable, String> getDepartingCityColumn() {
        return departingCityColumn;
    }

    public static TableColumn<FlightTable, String> getArrivalCityColumn() {
        return arrivalCityColumn;
    }
    
    public static TableColumn<FlightTable, String> getDepartingTimeColumn() {
		return departingTimeColumn;
	}

    public static TableColumn<FlightTable, Double> getPriceColumn() {
        return priceColumn;
    }

    public static TextField getSearch() {
        return search;
    }

    public static HBox getButtonLayout() {
        return buttonLayout;
    }

    public static Button getBackB() {
        return backB;
    }

    public static Button getAddB() {
        return addB;
    }

    public static Button getDeleteFlightsB() {
        return deleteFlightsB;
    }

}


package application;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

/** Controls the main application screen */
public class MainViewController {
	
    @FXML private TableView<ClaimDetails> tableView;
  @FXML private Button logoutButton;
  @FXML private Label  sessionLabel;
  
  @FXML
  private TableColumn<ClaimDetails, String> dcn;
  @FXML
  private TableColumn<ClaimDetails, String> name;
  @FXML
  private TableColumn<ClaimDetails, String> duplicate;

  public void initialize() {}
  
  public void initSessionID(final LoginManager loginManager, String sessionID) {
	  
	  dcn.setCellValueFactory(new PropertyValueFactory<ClaimDetails, String>("dcn"));
	  name.setCellValueFactory(new PropertyValueFactory<ClaimDetails, String>("name"));
	  duplicate.setCellValueFactory(new PropertyValueFactory<ClaimDetails, String>("duplicate"));

      
      tableView.getItems().setAll(parseClaimDetailsList());

      
    logoutButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        loginManager.logout();
      }
    });
  }
  
  private ObservableList<ClaimDetails> parseClaimDetailsList(){
	  ClaimDetails firstdcn = new ClaimDetails("123", "firstname", true);
	  ClaimDetails seconddcn = new ClaimDetails("456", "secondname", true);
	  ClaimDetails thirddcn = new ClaimDetails("789", "thirdname", true);
	  
	  ObservableList<ClaimDetails> result = FXCollections.observableArrayList();
	  result.add(firstdcn);
	  result.add(seconddcn);
	  result.add(thirddcn);
	  return result;
  }

}

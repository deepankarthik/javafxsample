package application;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class ClaimDetails {

	 
	   private final SimpleStringProperty dcn = new SimpleStringProperty("");
	   
	 	private final SimpleStringProperty name = new SimpleStringProperty("");
	   private final SimpleBooleanProperty isDuplicate = new SimpleBooleanProperty(false);

	public ClaimDetails() {
	        this("", "", false);
	    }
	 
	    public ClaimDetails(String dcn, String name, boolean isDuplicate) {
	        setDcn(dcn);
	        setName(name);
	        setIsDuplicate(isDuplicate);
	    }	    
	    
	    public String getDcn() {
			return dcn.get();
		}

		public String getName() {
			return name.get();
		}

		public boolean getIsDuplicate() {
			return isDuplicate.get();
		}

 
	    public void setDcn(String fDcn) {
	        dcn.set(fDcn);
	    }
	        	    
	    public void setName(String fName) {
	        name.set(fName);
	    }
	    
	    public void setIsDuplicate(boolean fDuplicate) {
	        isDuplicate.set(fDuplicate);
	    }
}

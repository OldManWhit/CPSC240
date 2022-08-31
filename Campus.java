import java.util.ArrayList;

public class Campus {
    private String campusName = null;
    public ArrayList<String> campusPlace = new ArrayList<String>();
    private static String campusState = null;
    

    // parameterized constructor
    public Campus(String campusName){
        this.campusName = campusName;
    }
    // Default constructor    
    public Campus() {

    }

    public ArrayList<String> addPlaces(String place) {
        campusPlace.add(place);
        return campusPlace;
    }
    /**
     * Getter for campusPlace
     * @return campusPlace
     */
    public ArrayList<String> getCampusPlace() {
        return campusPlace;
    }
    /**
     * Getter for campusName
     * @return campusName
     */
    public String getCampusName() {
        return campusName;
    }
    /**
     * Getter for campusState
     * @return campusState
     */
    public String getCampusState() {
        campusState = "Virginia";
        return campusState;
    }
    /**
     * Setter for campusPlace ArrayList
     * @param place sets the next place
     */
    public void setCampusPlace(ArrayList<String> place) {
        campusPlace = place;
    }
    /**
     * Setter for campusName
     * @param name
     */
    public void setCampusName(String name){
        campusName = name;
    }
    /**
     * Setter for campusState
     * @param campusState passes
     */
    public void setCampusState() {
    //    Campus.campusState = campusState;
    }
    /**
     * toString() method to return the object created
     */
    public String toString() {
        
        return "The Campus name is " + campusName + " and the place to meet is at " + campusPlace + ", in the state of" + campusState + ".";

    }
}

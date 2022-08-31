import java.util.ArrayList;

public class Campus {
    static String campusName = null;
    static ArrayList<String> campusPlace = new ArrayList<String>();
    static String campusState = null;
    


    // Default constructor    
    public Campus() {

    }

    // main
    public static void main(String[] args) {
        Campus UMW = new Campus();

        campusState = "Virginia";
        Campus.setCampusName("UMW");
        campusPlace.add("green");

        System.out.println(UMW.getCampusName());
        System.out.println(UMW.getCampusPlace());
        System.out.println(UMW.getCampusState());

        Campus VSU = new Campus();
        Campus.setCampusName("VSU");
        campusPlace.add("blue");
        System.out.println(VSU.getCampusName());
        System.out.println(VSU.getCampusPlace());
        System.out.println(VSU.getCampusState());
        System.out.println(UMW.toString());
    }

    public void addPlaces(String place) {
        campusPlace.add(place);
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
    public static void setCampusName(String name){
        campusName = name;

    }
    /**
     * Setter for campusState
     * @param campusState passes
     */
    public static void setCampusState() {
    //    Campus.campusState = campusState;
    }
    /**
     * toString() method to return the object created
     */
    public String toString() {
        
        return "The Campus name is " + campusName + " and the place to meet is at " + campusPlace + ", in the state of" + campusState + ".";

    }
}


// Campus Class Defined

public class Campus {

    private String campusName, campusPlace;


    // Constructor 

    public Campus(String campusName, String campusPlace) {
        this.campusName = campusName;
        this.campusPlace = campusPlace;
    }




    public Campus() {

    }
    /**
     * A getter to return Campus Name
     * @return Name of the Campus
     */
    public String getName() {
        return campusName;
    }
    /**
     * A getter to return the Campus Place
     * @return Place on Campus
     */
    public String getPlace() {
        return campusPlace;
    }
    /**
     * A setter to set the Campus Name
     * @param cName sets the name of the Campus
     */
    public void setName(String cName) {
        campusName = cName;

    }
    /**
     * A setter to set the Place on Campus
     * @param cPlace sets the name of the Place on Campus
     */
    public void setPlace(String cPlace) {
        campusPlace = cPlace;
    }

    //toString

    public String toString() {
        
        return "The Campus name is " + campusName + " and the place to meet is at " + campusPlace + ".";

    }

}
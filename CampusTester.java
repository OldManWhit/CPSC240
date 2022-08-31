import java.util.ArrayList;

public class CampusTester {

     // main
     public static void main(String[] args) {
        Campus UMW = new Campus("UMW");
        Campus VSU = new Campus("VSU");

        UMW.addPlaces("Ball Circle");

        ArrayList<String> whatever = new ArrayList<>();
        whatever = UMW.campusPlace;

        UMW.setCampusName("UMW");
        campusPlace.add("green");

        System.out.println(UMW.getCampusName());
        System.out.println(UMW.getCampusPlace());
        System.out.println(UMW.getCampusState());

        Campus VSU = new Campus();
        Campus.setCampusName("VSU");
        campusPlace.add("blue");
        System.out.println(VSU.getCampusName());

    }
}

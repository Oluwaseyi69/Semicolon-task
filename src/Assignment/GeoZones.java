package Assignment;

public enum GeoZones {


    NORTH_CENTRAL("Benue", "FCT","Kogi", "Kwara", "Nasarawa", " Niger", "Plateau"),
    NORTH_EAST("Adamawa ", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe."),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", " Enugu", "Imo"),
    SOUTH_SOUTH("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", " Osun", "Ondo", "Ogun", "Oyo");


    private String[] states;

    public String[] getStates() {
        return states;
    }


    GeoZones(String...states){
         this.states = states;
     }


    public static GeoZones displayZone(String state) {
        for (GeoZones zones : GeoZones.values()){
            for(String zone: zones.getStates()){
                if (zone.equalsIgnoreCase(state)){
                    return zones;
                }
            }
        }
        return null;

    }
}

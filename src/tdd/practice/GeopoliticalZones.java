package tdd.practice;

public enum GeopoliticalZones {
    NORTH_EAST("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe States."),
    NORTH_WEST("JIgawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara States."),
    NORTH_CENTRAL("Benue, Kogi, Kwara, Nasarawa, Niger, Plateau States, Federal Capital Territory"),

    SOUTH_SOUTH("Akwa-Ibom, Bayelsa, Cross-River, Delta, Edo, Rivers States"),
    SOUTH_EAST("Abia, Anambra, Ebonyi, Imo States"),
    SOUTH_WEST("Ekiti, Lagos, Ogun, Oyo States"), Benue(NORTH_CENTRAL.name());



    private final String states;

    GeopoliticalZones(String states) {
        this.states = states;
    }
    public String state(){
        return this.states;
    }
}

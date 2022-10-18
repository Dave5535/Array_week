package se.lexicon;

public class NameStorage {

    private static String[] Names = {"David", "Casper", "Noel", "Svenne", "Eliax", "Arvid"};

    public static String[] City = {"Paris", "London", "New York", "Stockholm"};
    public static String findName(String nametofind) {

        for (String element : Names) {
            if (element.equalsIgnoreCase(nametofind)) {
                return element;
            }


        }
        return "Error no match found";
    }

    public static String findcity(String citytofind) {

        for (String element : City) {
            if (element.equalsIgnoreCase(citytofind)) {
                return element;
            }


        }
        return "Error no city found";
    }


}


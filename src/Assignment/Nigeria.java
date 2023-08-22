//package Assignment;
////
////import java.util.Objects;
////import java.util.Scanner;
////
////import static Assignment.GeoZones.*;
////import static java.lang.System.in;
////import static java.lang.System.out;
////
////public class Nigeria {
////    public static void main(String... args) {
////        Scanner scanner = new Scanner(in);
////        try {
////            out.println("Enter state: ");
////            String state = scanner.next();
////
////            changeZoneCase(String.valueOf(displayZone(state)));
////
////        } catch (Exception e) {
////            out.println(e.getMessage());
////            main();
////        }
////
////
////    }
////
////
////
////    private static void changeZoneCase(String openZone) {
////
////        switch (openZone){
////            case "SOUTH_SOUTH" -> out.println("SOUTH SOUTH");
////            case "NORTH_EAST" -> out.println("NORTH EAST");
////            case "NORTH_WEST" -> out.println("NORTH WEST");
////            case "SOUTH_EAST" -> out.println("SOUTH EAST");
////            case "SOUTH_WEST" -> out.println("SOUTH WEST");
////            case "NORTH_CENTRAL" -> out.println("NORTH CENTRAL");
////            default -> {
////                out.println("Not a state");
////                main();
////            }
////        }
////    }
////}
//
//
//import java.util.Objects;
//import java.util.Scanner;
//
//import static Assignment.GeoZones.*;
//import static java.lang.System.in;
//import static java.lang.System.out;
//
//public class Nigeria{
//    static Scanner scanner = new Scanner(in);
//    public static void main(String...args) {
//        try {
//            out.println("Enter any state to get your zone: ");
//            String state = scanner.next();
//            displayZone(state);
//            if (displayZone(state).(String.valueOf(SOUTH_WEST))) {
//                out.println("SOUTH WEST");
//            } else out.println("Not a state");
//
//        }catch (IllegalArgumentException e){
//            e.getMessage();
//        }
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//

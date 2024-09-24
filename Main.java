public class Main {

    public static void main(String[] args) {

        Building building = new Building("Ankara Town Hall", UsageType.GOVERNMENT, GeometryType.POINT, Color.WHITE, Marker.CIRCLE);
        Mappable.printMapProperties(building);

        System.out.println("-".repeat(150));

        UtilityLine ul = new UtilityLine("Istiklal st.",UtilityType.FIBER_OPTIC, GeometryType.LINE, Color.BLUE, Marker.DOTTED);
        Mappable.printMapProperties(ul);


    }

}

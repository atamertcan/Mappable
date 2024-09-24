enum UtilityType {
    FIBER_OPTIC,
    ELECTRIC_WIRES,
    ETHERNET_CABLES
}

public class UtilityLine implements Mappable{

    private String name;
    private UtilityType uType;
    private GeometryType gType;
    private Color color;
    private Marker marker;

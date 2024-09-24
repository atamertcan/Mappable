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

    public UtilityLine(String name, UtilityType uType, GeometryType gType, Color color, Marker marker) {
        this.name = name;
        this.uType = uType;
        this.gType = gType;
        this.color = color;
        this.marker = marker;
    }

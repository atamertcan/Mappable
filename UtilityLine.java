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

    @Override
    public String getLabel() {
        return name + "(" + uType + ")";
    }

    @Override
    public GeometryType getType() {
        return gType;
    }

    @Override
    public Marker getMarker() {
        return marker;
    }

    @Override
    public String toString() {
        return "UtilityLine{" +
                "name='" + name + '\'' +
                ", uType=" + uType +
                ", gType=" + gType +
                ", color=" + color +
                ", marker=" + marker +
                '}';
    }
}

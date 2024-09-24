enum UsageType {
    GOVERNMENT,
    INSTITUTIONAL,
    AGRICULTURAL,
    EDUCATION,
    HOUSING
}

public class Building implements Mappable{

    private String name;
    private UsageType usage;
    private GeometryType gType;
    private Color color;
    private Marker marker;

    public Building(String name, UsageType usage, GeometryType gType, Color color, Marker marker) {
        this.name = name;
        this.usage = usage;
        this.gType = gType;
        this.color = color;
        this.marker = marker;
    }

    @Override
    public String getLabel() {
        return name + "(" + usage + ")";
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
        return "Building{" +
                "name='" + name + '\'' +
                ", usage=" + usage +
                ", gType=" + gType +
                ", color=" + color +
                ", marker=" + marker +
                '}';
    }
}

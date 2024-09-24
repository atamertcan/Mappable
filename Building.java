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

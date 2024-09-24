public interface Mappable {

    String getLabel();
    GeometryType getType();
    Marker getMarker();

    String JSON_PROPERTY = """
            "properties":{%s}
            """;

public interface Mappable {

    String getLabel();
    GeometryType getType();
    Marker getMarker();

    String JSON_PROPERTY = """
            "properties":{%s}
            """;

    default void toJSON(){
        String printString = String.format("\"type\" : \"%s\", \"label\" : \"%s\", \"marker\" : \"%s\" ",
                getType(), getLabel(), getMarker() );
        System.out.print(printString);

    }

    static void printMapProperties(Mappable mappable){

        String jsonString = String.format(JSON_PROPERTY, mappable.toString());
        System.out.println("{" + jsonString + ", ");
        mappable.toJSON();
        System.out.println("}");

    }
}

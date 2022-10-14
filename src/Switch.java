public class Switch {

    public static void main(String[] args) {
        var estacion = "INVIERNO";

        switch(estacion) {
            case "VERANO":
            System.out.println("es verano");
            break;
            case "INVIERNO":
            System.out.println("es invierno");
            break;
            case "OTONO":
            System.out.println("es invierno");
            break;
            case "PRIMAVERA":
            System.out.println("es invierno");
            break;
            default:
            System.out.println(estacion);
        }
    }
}
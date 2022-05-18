public class ControlFlow {

    public static boolean checkIfMoreThan30Guests(int customers) {
        if (customers > 30) {
            System.out.println("Zu viele Personen");
            return true;
        }else{
            System.out.println("Maximale Personenzahl nicht ueberschritten!");
            return false;
        }
    }
}

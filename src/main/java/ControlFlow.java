public class ControlFlow {

    public static boolean checkIfMoreThan30Guests(int customers) {
        if (customers > 30) {
            System.out.println("Zu viele Personen");
            return true;
        } else {
            System.out.println("Maximale Personenzahl nicht ueberschritten!");
            return false;
        }
    }


    public static String checkTooManyCustomers(String alert, int customer) {
        switch (alert) {
            case "rot":
                return "Keine Personen erlaubt";
            case "gelb":
                if(customer > 30) {
                    return "Zu viele Personen";
                }
                return "Max Anzahl nicht erreicht";
            case "gruen":
                if(customer > 60) {
                    return "Zu viele Personen";
                }
                return "Max Anzahl nicht erreicht";
            default:
                return "unknown alarm level";
        }

    }
}
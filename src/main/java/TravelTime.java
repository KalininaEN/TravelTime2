public class TravelTime {

    public static void main(String[] args) {

        final int distanceHomeOffice = 15;
        System.out.println("distanceHomeOffice = " + distanceHomeOffice);

        final double averageSpeed = 35;
        System.out.println("averageSpeed = " + averageSpeed);

        final double travelTimeToOffice = distanceHomeOffice / averageSpeed;
        System.out.println("travelTimeToOffice = " + travelTimeToOffice);

        final double decelerationFactor = 2.1;
        System.out.println("decelerationFactor = " + decelerationFactor);

        final double travelTimeToHome = distanceHomeOffice / averageSpeed * decelerationFactor;
        System.out.println("travelTimeToHome = " + travelTimeToHome);
    }
}

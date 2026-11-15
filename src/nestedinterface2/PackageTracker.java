package nestedinterface2;

public class PackageTracker implements Logistics.Tracking {

    @Override
    public void trackPackage(int trackingId) {

        System.out.println("Tracking ID: " + trackingId);
        System.out.println("Package reached Bangalore Hub");
    }
}
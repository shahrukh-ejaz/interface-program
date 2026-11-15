package nestedinterface2;

public class TrackingDriver {

    public static void main(String[] args) {

        Logistics.Tracking tracker = new PackageTracker();

        tracker.trackPackage(78521);
    }
}
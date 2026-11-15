package nestedinterface2;

public interface Logistics {

    interface Tracking {
        void trackPackage(int trackingId);
    }
}
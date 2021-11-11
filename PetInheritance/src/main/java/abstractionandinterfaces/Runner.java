package abstractionandinterfaces;

public class Runner {
    public static void main(String[] args) {
        PersonalComputers pc = new PersonalComputers();
        MobileDevice mobile = new MobileDevice();
        Tablet tablet = new Tablet();

        pc.clockSpeed();
        pc.coreCount();
        mobile.screenSize();
        mobile.storageType();
        tablet.coolingType();
        tablet.cooling();
    }
}

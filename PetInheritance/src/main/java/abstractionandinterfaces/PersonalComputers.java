package abstractionandinterfaces;

public class PersonalComputers implements Screen, Processor, Storage {

    @Override
    public void powerDraw() {
        System.out.println("High");
    }

    @Override
    public void clockSpeed() {
        System.out.println("Fast");
    }

    @Override
    public void coreCount() {
        System.out.println("Many");
    }

    @Override
    public void screenSize() {
        System.out.println("Big");
    }

    @Override
    public void screenType() {
        System.out.println("Lots of choice");
    }

    @Override
    public void refreshRate() {
        System.out.println("Varied");
    }

    @Override
    public void storageType() {
        System.out.println("HDD, SDD, NVMe");
    }

    @Override
    public void storageSize() {
        System.out.println("Lots of variety");
    }

    @Override
    public void storageSpeed() {
        System.out.println("Lots of variety");
    }
}

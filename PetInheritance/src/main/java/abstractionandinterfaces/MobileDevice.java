package abstractionandinterfaces;

public class MobileDevice implements Screen, Storage{
    @Override
    public void screenSize() {
        System.out.println("Small screen");
    }

    @Override
    public void screenType() {
        System.out.println("OLED");
    }

    @Override
    public void refreshRate() {
        System.out.println("Slow");
    }

    @Override
    public void storageType() {
        System.out.println("SSD and MicroSD");
    }

    @Override
    public void storageSize() {
        System.out.println("Variable. 512GB onboard.");
    }

    @Override
    public void storageSpeed() {
        System.out.println("Slow");
    }
}

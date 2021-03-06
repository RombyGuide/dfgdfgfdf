package skillbox.Computer;

public class Computer {
    private final CPU cpu;
    private final RAM ram;
    private final InformationStorage informationStorage;
    private final Screen screen;
    private final Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer() {
        this.vendor = null;
        this.name = null;
        this.cpu = null;
        this.ram = null;
        this.informationStorage = null;
        this.screen = null;
        this.keyboard = null;
    }

    public Computer(String vendor, String name, CPU cpu,
                    RAM ram, InformationStorage informationStorage,
                    Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.informationStorage = informationStorage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public InformationStorage getInformationStorage() {
        return informationStorage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, name, cpu, ram, informationStorage, screen, keyboard);
    }

    public Computer setName(String name) {
        return new Computer(vendor, name, cpu, ram, informationStorage, screen, keyboard);
    }

    public Computer setCPU(CPU cpu) {
        return new Computer(vendor, name, cpu, ram, informationStorage, screen, keyboard);
    }

    public Computer setRAM(RAM ram) {
        return new Computer(vendor, name, cpu, ram, informationStorage, screen, keyboard);
    }

    public Computer setInformationStorage(InformationStorage informationStorage) {
        return new Computer(vendor, name, cpu, ram, informationStorage, screen, keyboard);
    }

    public Computer setScreen(Screen screen) {
        return new Computer(vendor, name, cpu, ram, informationStorage, screen, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram, informationStorage, screen, keyboard);
    }

    public String toString() {
        return "?????????????????????????? ????????????????????: " + vendor + "; " +
                "???????????????? ????????????????????: " + name + "\n" +
                "????????????????????????" + "\n" +
                "??????????????????: " + cpu + "\n" +
                "?????????????????????? ????????????: " + ram + "\n" +
                "???????????????????? ????????????????????: " + informationStorage + "\n" +
                "??????????: " + screen + "\n" +
                "????????????????????: " + keyboard + "\n" +
                "?????????? ?????????? ???????? ?????????????????????????? - " + totalWeight();
    }

    public double totalWeight() {
        return cpu.getWeight() +
                ram.getWeightRAM() +
                informationStorage.getWeightMemory() +
                screen.getWeightScreen() +
                keyboard.getWeightKeyboard();
    }
}

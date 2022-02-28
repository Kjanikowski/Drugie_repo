package Computer;

public class PC extends Computer {


    private boolean isPowerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSupply = false;

        }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    public void switchOn() {
        System.out.println("Power supply checking ");


        if(isPowerSupply) {
            super.switchOn();
        }else {
            System.out.println("Power supply missing!");

        }
    }
    }



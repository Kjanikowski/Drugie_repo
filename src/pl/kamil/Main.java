package pl.kamil;

import Computer.Laptop;
import Computer.PC;

public class Main {

    public static void main(String[] args) {

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);

        gamingLaptop.setBatteryLevel(0);

        gamingLaptop.switchOn();
        System.out.println(gamingLaptop.getState());


        officeComputer.switchOn();
        System.out.println(officeComputer.getState());


        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());


    }
}

package main.apple.models;

public class IPhone11 extends IPhone {

    @Override
    public void getHardware() {

        System.out.println("Componentes do Hardware");
        System.out.println("\t- 4Gb ram");
        System.out.println("\t- 128Gb");
    }

}

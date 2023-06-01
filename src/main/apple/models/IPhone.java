package main.apple.models;

public abstract class IPhone {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Montando todos os hardwares");
    }

    public void certificate() {
        System.out.println("Testando todos os certificados");
    }

    public void pack() {
        System.out.println("Empacotando o dispositivo");
    }
}

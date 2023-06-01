package main.apple.factory;

import main.apple.models.IPhone;
import main.apple.models.IPhone11;

public class IPhoneFactory {

    public static IPhone createIPhone(String tipo) {
        IPhone device = null;

        if ("11".equalsIgnoreCase(tipo)) {
            device = new IPhone11();
        }
        if ("12".equalsIgnoreCase(tipo)) {
            device = new IPhone11();
        }

        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificate();
            device.pack();
        }

        return device;
    }

}

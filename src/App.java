import main.apple.factory.IPhoneFactory;
import main.apple.models.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Montando um iphone!");
        IPhone iphone = IPhoneFactory.createIPhone("11");
        System.out.println(iphone);
    }
}

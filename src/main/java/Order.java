import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    static ArrayList<DigitalVideoDisc> orders = new ArrayList<>();
    List fromJson =new ArrayList<>();

    void saveOrder() throws IOException {
        Scanner sc = new Scanner(System.in);

        DigitalVideoDisc dvd = new DigitalVideoDisc();
        System.out.println("set title : ");
        dvd.setTitle(sc.nextLine());
        System.out.println("set Category : ");
        dvd.setCategory(sc.nextLine());
        System.out.println("set Director : ");
        dvd.setDirector(sc.nextLine());
        System.out.println("set Cost : ");
        dvd.setCost(sc.nextDouble());
        System.out.println("set Length : ");
        dvd.setLength(sc.nextInt());
        orders.add(dvd);
        DataFromProperties.writeOnProperties();
        DataFromProperties.writeOnJson();
        fromJson=DataFromProperties.readFromJson();
        System.out.println(fromJson);
    }

}

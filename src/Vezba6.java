import java.sql.Struct;

public class Vezba6 {

    public static void main(String[] args){

        Proizvodi proizvodi = new Proizvodi();


        Double price1Double = Double.parseDouble(proizvodi.prize1);
        Double article1Dobule = Double.parseDouble(proizvodi.quantity);


        Double price2Double = Double.parseDouble(proizvodi.prize2);
        Double article2Dobule = Double.parseDouble(proizvodi.quantity);

    System.out.println("Сметка:");
    System.out.println("Едно чоколадо -"+proizvodi.article1.toLowerCase() + proizvodi.prize1 + proizvodi.currency+"и");
    System.out.println(price1Double + " x "+ price2Double + " = " + price1Double*article1Dobule);
    System.out.println("Еден сок" + proizvodi.article2.toLowerCase() + proizvodi.prize2 + proizvodi.currency+"и");
    System.out.println(price1Double + " x "+ price2Double + " = " + price2Double*article2Dobule);
    }
}

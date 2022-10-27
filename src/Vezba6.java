import java.sql.Struct;

public class Vezba6 {

    public static void main(String[] args){

        Proizvodi proizvodi = new Proizvodi();


        Double price1Double = Double.parseDouble(proizvodi.prize1);
        Double price2Double = Double.parseDouble(proizvodi.prize2);

    System.out.println("Сметка:");
    System.out.println("Едно чоколадо -"+proizvodi.article1.toLowerCase() + proizvodi.prize1 + proizvodi.currency+"и");
    System.out.println(price1Double + " + "+ price2Double + " = " + price1Double*price2Double);
    }
}

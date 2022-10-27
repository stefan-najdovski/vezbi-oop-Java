public class Vezba6 {

    public static void main(String[] args){

        Proizvodi proizvodi = new Proizvodi();


        Double price1Double = Double.parseDouble(proizvodi.prize1);
        Double price2Double = Double.parseDouble(proizvodi.prize2);
        Double quantity = Double.parseDouble(proizvodi.quantity);
        double sum = price1Double*quantity + price2Double*quantity;


            // so literals moze i vo var

            System.out.println("Сметка:");
            System.out.println("Едно чоколадо -"+proizvodi.article1.toLowerCase() +" "+ proizvodi.prize1 +" "+ proizvodi.currency+"и");
            System.out.println(price1Double + " x "+ price2Double + " = " + price1Double*quantity);
            System.out.println("Еден сок " + proizvodi.article2.toLowerCase() +" "+proizvodi.prize2 +" "+ proizvodi.currency+"и");
            System.out.println(price1Double + " x "+ price2Double + " = " + price2Double*quantity);
            System.out.println("Вкупна Цена:" + sum + " "+ proizvodi.currency+"и");

        }
    }

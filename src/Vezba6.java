public class Vezba6 {

    public static void main(String[] args){

        Proizvodi proizvodi = new Proizvodi();

        //Change from Double.parse to Integer.parse


        Integer price1Double = Integer.parseInt(proizvodi.prize1);
        Integer price2Double = Integer.parseInt(proizvodi.prize2);
        Integer quantity = Integer.parseInt(proizvodi.quantity);
        int sum = price1Double*quantity + price2Double*quantity;


            // so literals moze i vo var

            System.out.println("Сметка:");
            System.out.println("Едно "+proizvodi.article1.toLowerCase() +" "+ proizvodi.prize1 +" "+ proizvodi.currency+"и");
            System.out.println(price1Double + " x "+ price2Double + " = " + price1Double*quantity);
            System.out.println("Еден " + proizvodi.article2.toLowerCase() +" "+proizvodi.prize2 +" "+ proizvodi.currency+"и");
            System.out.println(price1Double + " x "+ price2Double + " = " + price2Double*quantity);
            System.out.println("Вкупна Цена:" + sum + " "+ proizvodi.currency+"и");

        }
    }

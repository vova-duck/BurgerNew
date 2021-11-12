package HomeWork11;




public class BurgerMain {


    public static void main(String[] args) {
        Burger burger1 = new Burger(1);
        Burger burger2 = new Burger();
        Burger burger3 = new Burger(1, 2);
        Burger burger4 = burger1;
        System.out.println(burger1);
        System.out.println(burger2);
        System.out.println(burger3);
        compareBurgers(burger1,burger2);
        compareBurgers(burger1,burger3);
        compareBurgers(burger2,burger3);
        compareBurgers(burger1,burger4);

    }

    public static void compareBurgers(Burger burger1, Burger burger2) {
       if (burger1.equals(burger2)){
           System.out.println(burger1.type + " and "+ burger2.type + "are same burgers");
       }else {
           System.out.println(burger1.type + " and "+ burger2.type +"are different burgers");
       }
    }
}













       

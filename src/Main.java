public class Main {
    public static void main(String[] args) {
//        CreditCards cards1 = new CreditCards(0, "4567 8982 1234 0548");
//        CreditCards cards2 = new CreditCards(20, "1234 4437 9565 9035");
//        CreditCards cards3 = new CreditCards(30, "4374 5435 9090 4345");

//        cards1.balans(cards1.getSum());
//        cards2.balans(cards2.getSum());
//        cards3.balans(cards3.getSum());

//        cards1.nachislenie(cards1.sum);
//        cards2.nachislenie(cards1.sum);
//        cards3.snatie(cards1.sum);

//        cards1.info(cards1.getSum(), cards1.getNomer_scheta());
//        cards1.info(cards2.getSum(), cards2.getNomer_scheta());
//        cards1.info(cards3.getSum(), cards3.getNomer_scheta());




//        Computer computer1 = new Computer(100, "asus");
//        Computer computer2 = new Computer(200, "huawei");
//
//        computer1.info(computer1.getSum(), computer1.getModel());
//        System.out.println();
//        computer2.info(computer2.getSum(), computer2.getModel());
//        System.out.println();
//
//        Computer computer3 = new Computer(10000, "asus", 1);
//        Computer computer4 = new Computer(20000, "huawei", 1);
//
//        computer3.info(computer3.getSum(), computer3.getModel());
//        System.out.println();
//        computer4.info(computer4.getSum(), computer4.getModel());

        Bankomat person = new Bankomat(2,3,4);
        person.balans();
        person.popolnenie(person.getSum(), 1,2,3);
        person.balans();
        person.snatie(person.getSum());
    }
}
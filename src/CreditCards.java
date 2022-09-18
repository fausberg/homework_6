import java.util.Scanner;

public class CreditCards {
    CreditCards(int sum, String nomer_scheta){
        this.nomer_scheta = nomer_scheta;
        this.sum = sum;
    }
    Scanner scanner = new Scanner(System.in);
    int sum;
    String nomer_scheta;

    int getSum(){
        return sum;
    }

    String getNomer_scheta(){
        return nomer_scheta;
    }

    void balans(int sum){
        System.out.println(sum);
    }

    int nachislenie(int sum){
        System.out.println("Введите какую сумму хотите положить на карту");
        int n = scanner.nextInt();
        this.sum += n;
        return sum;
    }
    int snatie(int sum){
        System.out.println("Введите какую сумму хотите снять с карты");
        int n = scanner.nextInt();
        this.sum -= n;
        return sum;
    }

    void info(int sum, String nomer_scheta){
        System.out.println("Информация по карте: ");
        System.out.println("Сумма счёта: "+sum);
        System.out.println("Номер счёта: "+nomer_scheta);
    }
}

import java.util.Scanner;

public class Bankomat {

    Bankomat(int kup_20, int kup_50, int kup_100){
        this.kup_20 = kup_20;
        this.kup_50 = kup_50;
        this.kup_100 = kup_100;
    }
    Scanner scanner = new Scanner(System.in);
    int kup_20;
    int kup_50;
    int kup_100;
    int sum = 0;

    int getSum(){
        return sum;
    }
    int getKup_20(){
        return kup_20;
    }
    int getKup_50(){
        return kup_50;
    }
    int getKup_100(){
        return kup_100;
    }

    void balans(){
        System.out.println(sum);
    }

    int popolnenie(int sum, int kup_20, int kup_50, int kup_100){
        this.sum += kup_20*20+kup_50*50+kup_100*100;
        return sum;
    }
     void snatie(int sum){
        System.out.println("Введите сумму которую хотите снять");
        int n = scanner.nextInt();
        boolean a = false;
        if(n <= sum){
           a = true;
           snatie2(n);
            System.out.println(a);
        }else{
            System.out.println(a);
        }
    }

    void snatie2(int n){
        int pum = 0;
        if(n % 20 != 0 && n % 50 != 0 && (n - 50) % 20 != 0 && n > 0){
            System.out.println("В банкомате нет таких купюр");
            return;
        }else if(n >= 100 && n % 100 != 0){
            pum = n/100;
            pum *= 100;
            n -= pum;
            pum /= 100;
            System.out.println("Выдано купюр в размере 100:" + pum);
            if(n >= 50){
                pum = n/50;
                pum *= 50;
                n -= pum;
                pum /= 50;
                System.out.println("Выдано купюр в размере 50:" + pum);
                if(n == 0){
                    return;
                }
                pum =n/20;
                System.out.println("Выдано купюр в размере 20:" + pum);
                return;
            }else if(n != 0){
                pum =n/20;
                System.out.println("Выдано купюр в размере 20!:" + pum);
            }
        }else if(n == 20 && n != 0){
            System.out.println("Выдано купюр в размере 20: 1");
            return;
        } else if (n < 50 && n != 0) {
            pum = n/20;
            System.out.println("Выдано купюр в размере 20:" + pum);
            return;
        }else if(n > 50 || n < 100){
            pum = n/50;
            pum *= 50;
            n -= pum;
            pum /= 50;
            System.out.println("Выдано купюр в размере 50:" + pum);
            pum =n/20;
            System.out.println("Выдано купюр в размере 20:" + pum);
            return;
        }
        return;
    }


}

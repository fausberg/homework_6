public class Computer {
    Computer(int sum, String model, int x){
        this(sum, model);
        ram = new RAM(8,"ram");
        hdd = new HDD(256,"hdd","внутренний");
    }

    Computer(int sum, String model){
        this.sum = sum;
        this.model = model;
        ram = new RAM();
        hdd = new HDD();
    }

    int sum;
    String model;

    RAM ram = new RAM();
    HDD hdd = new HDD();

    int getSum(){
        return sum;
    }

    String getModel(){
        return model;
    }

    void info(int sum, String model){
        System.out.println("Информаци по компьютеру");
        System.out.println("Стоит: " + sum);
        System.out.println("Модель: "+ model);
        ram.info(ram.getPum(), ram.getName());
        hdd.info(hdd.getPum(), hdd.getName(), hdd.getType());
    }
}

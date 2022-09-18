public class HDD {
    HDD(){}

    HDD(int pum, String name, String type){
        this.name = name;
        this.pum = pum;
        this.type = type;
    }

    int pum;
    String name = "default";
    String type = "default";

    int getPum(){
        return pum;
    }

    String getName(){
        return name;
    }

    String getType(){
        return type;
    }

    void info(int pum, String name, String type){
        System.out.println("Инфо hdd");
        System.out.println("Память hdd: "+pum);
        System.out.println("Название hdd: "+name);
        System.out.println("Тип hdd: "+type);
    }
}

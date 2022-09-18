public class RAM {
    RAM(){}

    RAM(int pum, String name){
        this.pum = pum;
        this.name = name;
    }

    int pum = 4;
    String name = "default";

    int getPum(){
        return pum;
    }

    String getName(){
        return name;
    }

    void info(int pum, String name){
        System.out.println("Инфо RAM");
        System.out.println("Память RAM: "+pum);
        System.out.println("Название RAM: "+name);
    }
}

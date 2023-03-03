public class Puffendui extends Hogwarts {
    /* private String zechariahSmith = "Zechariah Smith";
     private String cedricDiggory = "Cedric Diggory";
     private String justinFinchFletchley = "Justin Finch-Fletchley";//hardworking, loyal, honest.
    *///На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
    private int hardworking;  //трудолюбие
    private int loyal;        //верность
    private int honest;       //честность
    public int count(){
        int sum = 0;
        sum = hardworking + loyal + honest + getMagic() + getTransgression();

        return sum;

    }

    public static void compare(Puffendui puffendui,Puffendui puffendui1) {
        int max = 0;
        if (puffendui1.count() > puffendui.count()) {
            max = puffendui1.count();
            System.out.println(max + " " + puffendui1.getName() + " лучший пуффендуец чем " + puffendui.getName() + " " + puffendui.count());
        }
        if (puffendui.count() > puffendui1.count()) {
            max = puffendui.count();

            System.out.println(max + " " + puffendui.getName() + " лучший пуффендуец чем " + puffendui1.getName() + " " + puffendui1.count());
        }
    }








    public Puffendui(String name, int magic, int transgression, int hardworking, int loyal, int honest) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

    }


    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Puffendui{" +
                "name " + getName() + ", hardworking=" +  hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest  + " ,transgression=" + getTransgression() + " magic= " + getMagic() +'}';
    }

}


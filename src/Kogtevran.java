public class Kogtevran extends Hogwarts {
    /*private String zhouChang = "Zhou Chang";
    private String  padmaPatil = "Padma Patil";
    private String   marcusBelby = "Marcus Belby";                                 //The Faculty of Ravenclaw studies Zhou Chang, Padma Patil and Marcus Belby.
 }*/
//mind wisdom wit creativity
//ум мудрость остроумие творчество
    private int mind;  //ум
    private int wisdom;  //мудрость
    private int wit;   // остроумие
    private int creativity;  //творчество
    public int count(){
        int sum = 0;
        sum = getMind() + getWisdom() + getCreativity() + getMagic() + getTransgression();

        return sum;

    }

    public static void compare(Kogtevran kogtevran,Kogtevran kogtevran1) {
        int max = 0;
        if (kogtevran1.count() > kogtevran.count()) {
            max = kogtevran1.count();
            System.out.println(max + " " + kogtevran1.getName() + " лучший когтевранец чем " + kogtevran.getName() + " " + kogtevran.count());
        }
        if (kogtevran.count() > kogtevran1.count()) {
            max = kogtevran.count();

            System.out.println(max + " " + kogtevran.getName() + " лучший когтевранец чем " + kogtevran1.getName() + " " + kogtevran1.count());
        }
    }


    public Kogtevran(String name, int magic, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" + "name=" + getName() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", magic=" + getMagic() +
                ", transgression" + getTransgression() +
                '}';
    }
}
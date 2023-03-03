public class Slytherin extends Hogwarts {
    /*private String dracoMalfoy = "Draco Malfoy";
    private String grahamMontagu = "Graham Montagu";//Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
    private String gregoryGoyle = "Gregory Goyle";
}*///присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    //cunning, determination, ambition, resourcefulness, lust for power.
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int lustForpower; //жажда власти
    public int count(){
        int sum = 0;
        sum = getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForpower() + getMagic() + getTransgression();

        return sum;

    }

    public static void compare(Slytherin slytherin,Slytherin slytherin1) {
        int max = 0;
        if (slytherin1.count() > slytherin.count()) {
            max = slytherin1.count();
            System.out.println(max + " " + slytherin1.getName() + " лучший слизеринец чем " + slytherin.getName() + " " + slytherin.count());
        }
        if (slytherin.count() > slytherin1.count()) {
            max = slytherin.count();

            System.out.println(max + " " + slytherin.getName() + " лучший слизеринец чем " + slytherin1.getName() + " " + slytherin1.count());
        }
    }


    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForpower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForpower = lustForpower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForpower() {
        return lustForpower;
    }

    public void setLustForpower(int lustForpower) {
        this.lustForpower = lustForpower;
    }



    @Override
    public String toString() {
        return "Slytherin{" + "name " + getName() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForpower=" + lustForpower +
                ", magic=" + getMagic() + ", transgression=" + getTransgression() +
                '}';
    }
}

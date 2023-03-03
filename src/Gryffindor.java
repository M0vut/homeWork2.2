public class Gryffindor  extends Hogwarts {
    /*  private String garryPotter = "Harry potter";
      private String hermioneGranger = "Hermione Granger"; //Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
      private String ronWeasley = "Ron weasley";
  */
    private int nobility; //благородство
    private int honor;   //честь
    private int bravery; //храбрость
    public int count(){
        int sum = 0;
        sum = getNobility() + getHonor() + getBravery() + getMagic() + getTransgression();

        return sum;

    }

    public static void compare(Gryffindor gryffindor,Gryffindor gryffindor1) {
        int max = 0;
        if (gryffindor1.count() > gryffindor.count()) {
            max = gryffindor1.count();
            System.out.println(max + " " + gryffindor1.getName() + " лучший гриффендорец чем " + gryffindor.getName() + " " + gryffindor.count());
        }
        if (gryffindor.count() > gryffindor1.count()) {
            max = gryffindor.count();

            System.out.println(max + " " + gryffindor.getName() + " лучший гриффендорец чем " + gryffindor1.getName() + " " + gryffindor1.count());
        }
    }


    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + "name " + getName() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", magic=" + getMagic() +
                ", transgression" + getTransgression() +
                '}';
    }
}
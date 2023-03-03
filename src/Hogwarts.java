public class Hogwarts {
    private String name;
    private int magic; //магия
    private int transgression;//трансгресия
    public int count(){
        int sum = 0;
        sum = getMagic() + getTransgression();

        return sum;

    }

    public static void compare(Hogwarts hogwarts,Hogwarts hogwarts1) {
        int max = 0;
        if (hogwarts1.count() > hogwarts.count()) {
            max = hogwarts1.count();
            System.out.println(max + " " + hogwarts1.getName() + " лучший хогвартец чем " + hogwarts.getName() + " " + hogwarts.count());
        }
        if (hogwarts.count() > hogwarts1.count()) {
            max = hogwarts.count();

            System.out.println(max + " " + hogwarts.getName() + " лучший хогвартец чем " + hogwarts1.getName() + " " + hogwarts1.count());
        }
    }



    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getMagic() {
        return magic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }
}

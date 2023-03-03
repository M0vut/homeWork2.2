public class Main {
    public static void main(String[] args) {


        Puffendui zechariahSmith = new Puffendui("Zechariah Smith", 54, 48, 75, 43, 88);
        Puffendui cedricDiggory = new Puffendui("Cedric Diggory", 93, 56, 76, 54, 4);
        Puffendui justinFinch_Fletchley = new Puffendui("Justin Finch-Fletchley", 77, 33, 74, 98, 23);


        Puffendui.compare(zechariahSmith,cedricDiggory);

        Gryffindor harryPotter = new Gryffindor("Harry potter", 34, 90, 35, 77, 75);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 43, 90, 32, 90, 45);
        Gryffindor ronWeasley = new Gryffindor("Ron weasley", 76, 43, 99, 21, 74);

        Gryffindor.compare(hermioneGranger,harryPotter);

        Kogtevran zhouChang = new Kogtevran("Zhou Chang", 45, 23, 98, 21, 44, 99);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 99, 34, 19, 65, 88, 33);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby", 44, 33, 98, 22, 99, 11);

        Kogtevran.compare(zhouChang, padmaPatil);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 33, 99, 45, 98, 32, 54, 33);
        Slytherin grahamMontagu = new Slytherin("Graham Montagu", 76, 55, 23, 98, 43, 33, 34);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 33, 65, 23, 65, 12, 98, 45);

        Slytherin.compare(dracoMalfoy, gregoryGoyle);

        System.out.println(harryPotter);
        System.out.println(padmaPatil);
        System.out.println(dracoMalfoy);
        System.out.println(justinFinch_Fletchley);

        Hogwarts.compare(grahamMontagu,marcusBelby);


    }
}

import java.util.LinkedList;
import java.util.Random;

public class Lottery {
    LinkedList<Toy> toyCommonList;

    public Lottery(LinkedList<Toy> toyCommonList) {
        this.toyCommonList = toyCommonList;
    }

    public void getToy(LinkedList<Toy> toyCommonList){
        Random rnd = new Random();
        Toy yourToy = toyCommonList.get(rnd.nextInt(toyCommonList.size()));
        System.out.printf("Your toy ID is %s, your toy name is %s \n", yourToy.getID(), yourToy.getToyName());
    }
}

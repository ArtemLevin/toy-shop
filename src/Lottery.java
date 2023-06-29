import java.util.LinkedList;
import java.util.Random;
// класс позволяет реализовать однократный розыгрыш случайной игрушки из общей очереди
public class Lottery {
    LinkedList<Toy> toyCommonList;

    public Lottery(LinkedList<Toy> toyCommonList) {
        this.toyCommonList = toyCommonList;
    }

    public Toy getToy(LinkedList<Toy> toyCommonList){
        Random rnd = new Random();
        Toy yourToy = toyCommonList.get(rnd.nextInt(toyCommonList.size()));// при помощи генератора псевдослучайных
        // чисел определяем индекс игрушки в общей очереди
        System.out.printf("Your toy ID is %s, your toy name is %s \n", yourToy.getID(), yourToy.getToyName());
        return yourToy;
    }
}

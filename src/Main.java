import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Toy> initialToyList = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            Toy toy = new Toy();
            System.out.print("Введите ID игрушки: ");
            toy.setID(input.next());
            System.out.println();
            System.out.print("Введите вес игрушки: ");
            toy.setWeight(input.nextInt());
            System.out.println();
            System.out.print("Введите название игрушки: ");
            toy.setToyName(input.next());
            System.out.println();
            initialToyList.add(toy);
        }

        ToySet toySet = new ToySet(initialToyList);
        List<Toy> currentToySet = toySet.fillingOutToySet(initialToyList);

        System.out.println();

        Queue queue = new Queue(currentToySet);
        PriorityQueue<Toy> priorityQueue = queue.composePriorityQueue(currentToySet);

        CommonQueue commonQueueComposer = new CommonQueue(priorityQueue);
        LinkedList<Toy> commonQueue = commonQueueComposer.composeCommonQueue(priorityQueue);

        System.out.println();

        Lottery lottery = new Lottery(commonQueue);
        for(int i = 0; i < 10; i++){
            lottery.getToy(commonQueue);
        }

    }
}
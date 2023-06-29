import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Toy> initialToyList = new ArrayList<>(); // инициализируем список, который будет хранить типы созданных нами игрушек
        for (int i = 0; i < 3; i++){ // цикл позволяет создать необходимое нам количество типов различных игрушек
            Toy toy = new Toy(); // создаем объект toy и далее заполняем поля объекта
            System.out.print("Введите ID игрушки: ");
            toy.setID(input.next());
            System.out.println();
            System.out.print("Введите вес игрушки: ");
            toy.setWeight(input.nextInt());
            System.out.println();
            System.out.print("Введите название игрушки: ");
            toy.setToyName(input.next());
            System.out.println();
            initialToyList.add(toy); // добавляем созданный тип игрушки в список для хранения
        }

        ToySet toySet = new ToySet(initialToyList); // создаем объект набора игрушек на основе созданных нами типов игрушек
        List<Toy> currentToySet = toySet.fillingOutToySet(initialToyList); /// для заполнения набора с учетом веса
        // каждой игрушки используем соответствующий метод

        System.out.println();

        Queue queue = new Queue(currentToySet); //для дальнейшего учета веса игрушки каждого типа создаем PriorityQueue
        PriorityQueue<Toy> priorityQueue = queue.composePriorityQueue(currentToySet); // вызываем на объекте
        // соответствующий метод

        CommonQueue commonQueueComposer = new CommonQueue(priorityQueue); // для дальнейшей удобной работы создаем
        // объект общей очереди
        LinkedList<Toy> commonQueue = commonQueueComposer.composeCommonQueue(priorityQueue);// для этого вызываем
        // соответствующий метод на объекте

        System.out.println();

        Lottery lottery = new Lottery(commonQueue); // создаем объект лотереи
        for(int i = 0; i < 10; i++){  //разыгрываем лотерею интересующее число раз
            lottery.getToy(commonQueue); // вызываем на объекте метод, который случайным образом выбирает игрушку из созданной ранее очереди
        }

    }
}
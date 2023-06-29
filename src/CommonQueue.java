import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class CommonQueue {
    PriorityQueue<Toy> priorityQueue;

    public CommonQueue(PriorityQueue<Toy> priorityQueue) {
        this.priorityQueue = priorityQueue;
    }

    public LinkedList<Toy> composeCommonQueue(PriorityQueue<Toy> priorityQueue) {
        LinkedList<Toy> toyCommonQueue = new LinkedList<>();
        while (priorityQueue.size()!=0) {
            toyCommonQueue.addFirst(priorityQueue.poll());
        }
        return toyCommonQueue;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Toy> toyList = new ArrayList<>();
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
            toyList.add(toy);
        }

        PriorityQueue<Toy> queue = new PriorityQueue<>();
        for (Toy toy:toyList){
            queue.add(toy);
        }

        Toy currentToy = null;

        while((currentToy = queue.poll())!= null) { // Retrieves and removes
            System.out.println("--- Toy ID: " + currentToy.getID() + " ---");
            System.out.println("   >> Toy name: " + currentToy.getToyName());
            System.out.println();
        }
    }
}
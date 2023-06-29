import java.util.ArrayList;
import java.util.List;

public class ToySet{
    List<Toy> toyList;

    public ToySet(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public  List<Toy> fillingOutToySet(List<Toy> toyList) {
        List <Toy> toySet = new ArrayList<>();
        for(Toy toy:toyList){
            for(int i = 0; i < toy.getWeight(); i++ ){
                toySet.add(toy);
            }
        }
        return toySet;
    }
}

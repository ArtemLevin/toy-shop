import java.util.ArrayList;
import java.util.List;

// класс, позволяющий создать набор игрушек. Класс принимает список уникальных типов игрушек и особым образом
// учитвает их вес. В частности, метод fillingOutToySet заполняется следующим образом: если вес некоторой игрушки
// равен 5, то в формируемый набор будет добавлено 5 экземпляров данного типа игрушки, если вес игрушки второго
// типа равен 10, то в тот же самый список дополнительно будет добавлено еще 10 экземпляров игрушек второго типа
// и так далее
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

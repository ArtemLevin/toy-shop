public class Toy implements Comparable<Toy> {

    private String ID;
    private int weight;
    private String toyName;

    public void toy(String ID, int weight, String toyName) {
        this.ID = ID;
        this.weight = weight;
        this.toyName = toyName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "toyShop{" +
                "ID=" + ID +
                ", weight=" + weight +
                ", toyName='" + toyName + '\'' +
                '}';
    }

    public int compareTo(Toy other) {
        if (other == null) {
            return -1; // this < other
        }
        int delta = this.weight - other.weight;
        if (delta != 0) {
            return - delta;
        }
        return this.toyName.compareTo(other.toyName);
    }


}




import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public int size() {
        return this.elements.size();
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String str = "The collection " + this.name + " has " + this.elements.size();

        if (isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        if (size() == 1) {
            str += " element:\n";
        }

        if (size() > 1) {
            str += " elements:\n";
        }

        String elementsStr = "";

        for (String element : this.elements) {
            if (element.equals(this.elements.get(size() - 1))) {
                elementsStr += element;
            } else {
                elementsStr += element + "\n";
            }
        }

        return str + elementsStr;
    }

}

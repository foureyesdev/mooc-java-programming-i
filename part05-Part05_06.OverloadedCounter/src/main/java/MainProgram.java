
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(1);
        counter.increase();
        counter.increase(4);
        counter.decrease();
        counter.decrease(2);
        System.out.println(counter.value());
    }
}

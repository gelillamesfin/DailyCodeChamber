import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Cat");

        for (int i = 0; i < animals.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("At even animals: " + animals.get(i));

            }
        }

        for (String value : animals) {
            System.out.println("All animals : " + value);
        }
    }
}

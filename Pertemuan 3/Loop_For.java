
// LOOPINGAN PADA FOR
public class Loop_For {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
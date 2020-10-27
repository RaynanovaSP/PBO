

public class Continue_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
            System.out.println("\n");

            int j = 0;
            while (j < 10){
                if (i == 4){
                    i++;
                    continue;
                }

                System.out.println(j);
                j++;
            }
        }
    }
}

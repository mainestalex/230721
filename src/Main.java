public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.population();
    }

    private void sequence() {
        int j = 7;
        while (j <= 98) {
            System.out.println(j);
            j += 7;
        }
    }

    private void multiplicationTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("=================");
        }
    }

    private void population() {
        int currentPopulation = 10000000;
        int beingBorn = 14;
        int beingDeath = 8;

        for (int i = 1; i <= 10; i++) {
            int yearBeingBorn = (currentPopulation / 1000) * beingBorn;
            int yearBeingDeath = (currentPopulation / 1000) * beingDeath;
            System.out.println(currentPopulation);

            currentPopulation = currentPopulation + yearBeingBorn - yearBeingDeath;

            System.out.println(yearBeingBorn);
            System.out.println(yearBeingDeath);
            System.out.println(currentPopulation);
            System.out.println("====================");
        }
        System.out.println(currentPopulation);
    }
}
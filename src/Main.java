public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        java.util.Random random = new java.util.Random();
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        java.util.Random random = new java.util.Random();
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int maxPayments = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPayments) {
                maxPayments = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPayments + " рублей");
        int minPayments = -1    ;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1]) {
                minPayments = arr[i];

            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayments + " рублей");
    }

    public static void task3() {
        java.util.Random random = new java.util.Random();
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        java.util.Random random = new java.util.Random();
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}














public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 200, 300, 25};
        SalesManager salesManager = new SalesManager(arr);

        int max = salesManager.max();

        System.out.println("Максимальная продажа: " + max);
    }
}

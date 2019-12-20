public class While {
    public static void main(String[] args) {
        int num = 100;

        while (num > 0) {
            System.out.println("Обратный отсчет с использованием while: " + num);
            num -= 10;
        }
    }
}
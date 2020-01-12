public class SubClass extends SuperClass{

    public static void main(String[] args) {
        
        hello();
        SuperClass.hello();
        try {
            SuperClass.echo(args[0]);
            echo(args[0]);
        } catch (Exception e) {
            System.out.println("Требуется аргумент");
        }
        
    }

    public static void hello() {
        System.out.println("Привет из Подкласса");
    }
}
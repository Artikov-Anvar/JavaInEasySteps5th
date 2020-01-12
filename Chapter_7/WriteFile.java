import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("tam.txt");
            BufferedWriter buffer = new BufferedWriter(file);

            buffer.write("111111111111111");
            buffer.newLine();
            buffer.write("222222222222222");
            buffer.newLine();
            buffer.write("333333333333333");
            buffer.newLine();
            buffer.write("444444444444444");
            buffer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка записи");
        }
    }
}
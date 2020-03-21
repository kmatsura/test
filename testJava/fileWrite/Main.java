import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            File file = new File("./data");
            FileWriter filewriter = new FileWriter(file);
            filewriter.write("abc");
            filewriter.close();
            System.out.println("テキストファイルの作成に成功しました");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

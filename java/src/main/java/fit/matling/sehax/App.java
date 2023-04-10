package fit.matling.sehax;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void printResult(int[] result, String path)
    {
        for (int i : result)
            System.out.print(i);
        System.out.printf("  %s\n", path);
    }
    public static void main( String[] args ) throws Exception
    {
        boolean binary = false;
        for (String i : args) {
            if (i.equals("--help")) {
                System.out.println(
                    "用法: sehaxsum [选项]... [文件]...\n" +
                    "计算 SEHAX 校验和.");
                return;
            }
            if (i.equals("--binary") || i.equals("-b"))
                binary = true;
        }
        for (String i : args) {
            if (i.startsWith("-"))
                continue;
            try {
                byte[] bytes = Files.readAllBytes(Paths.get(i));
                String content;
                if (binary)
					printResult(new Sehax45s().digestUnguarded(new Base48Reader(i), false), i);
                else
					printResult(new Sehax45s().digestUnguarded(new FileReader(i), false), i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

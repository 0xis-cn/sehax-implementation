package fit.matling.sehax;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

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
    public static void readShidinn(String path)
    {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(path));
            String content = new String(bytes, "UTF-8");
            printResult(new Sehax45s().digestUnguarded(content, false), path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main( String[] args ) throws Exception
    {
        boolean binary = false;
        for (String i : args) {
            if (i.equals("--help")) {
                System.out.println(
                    "用法: sehaxsum [选项]... [文件]...\n" +
                    "计算 SEHAX 校验和.");
            }
        }
        for (String i : args) {
            if (i.startsWith("-"))
                continue;
	    readShidinn(i);
        }
    }
}

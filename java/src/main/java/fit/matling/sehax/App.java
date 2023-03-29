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
    static char[] base48Pair(int val)
    {
        final String consonants = " ,bpmwjqxynzDsrHNldtgkh45vF7Bcf.";
        final String vowels = "uaoeEAYL62T83V1i";
        if ((val & 512) != 0) {
            return new char[]{ vowels.charAt((val & 480) >> 5), consonants.charAt(val & 31) };
        } else {
            return new char[]{ consonants.charAt((val & 496) >> 4), vowels.charAt(val & 15) };
        }
    }
    static String base48(byte[] bytes)
    {
        int paddingLength = ((bytes.length - 1) + 1) / 5 * 5;
        int oldLength = bytes.length;
        bytes = Arrays.copyOf(bytes, paddingLength);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < paddingLength; i += 5) {
            result.append(base48Pair(((bytes[i] & 0xff) << 2) ^ (bytes[i + 1] & 0xc0) >> 6));
            result.append(base48Pair(((bytes[i + 1] & 0x3f) << 4) ^ (bytes[i + 2] & 0xf0) >> 4));
            result.append(base48Pair(((bytes[i + 2] & 0x0f) << 6) ^ (bytes[i + 3] & 0xfc) >> 2));
            result.append(base48Pair(((bytes[i + 3] & 0x03) << 8) ^ (bytes[i + 4] & 0xff)));
        }
        for (int i = paddingLength; i < oldLength; ++i)
            result.append(',');
        return result.toString();
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
                    content = base48(bytes);
                else
                    content = new String(bytes, "UTF-8");
                printResult(new Sehax45s().digestUnguarded(content, false), i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

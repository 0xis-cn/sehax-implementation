package fit.matling.sehax;

import java.io.Reader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Base48Reader extends Reader 
{
	FileInputStream in;
	int pos, round;
	String out;
	public Base48Reader(String path) throws FileNotFoundException
	{
		this.in = new FileInputStream(path);
		this.round = 5;
		this.pos = 8;
	}
    static char[] base48Pair(int val)
    {
        final String consonants = "bpmwjqxynzDsrHNldtgkh45vF7Bcf ,.";
        final String vowels = "uaoeEAYL62T83V1i";
        if ((val & 512) != 0) {
            return new char[]{ vowels.charAt((val & 480) >> 5), consonants.charAt(val & 31) };
        } else {
            return new char[]{ consonants.charAt((val & 496) >> 4), vowels.charAt(val & 15) };
        }
    }
	/**
	 * 获取 base48 的基本函数。. 运算过程。
	 *
	 * @param bytes 长度须为 5
	 */
    static String base48(byte[] bytes)
    {
        StringBuilder result = new StringBuilder();
		result.append(base48Pair(((bytes[0] & 0xff) << 2) ^ (bytes[1] & 0xc0) >> 6));
		result.append(base48Pair(((bytes[1] & 0x3f) << 4) ^ (bytes[2] & 0xf0) >> 4));
		result.append(base48Pair(((bytes[2] & 0x0f) << 6) ^ (bytes[3] & 0xfc) >> 2));
		result.append(base48Pair(((bytes[3] & 0x03) << 8) ^ (bytes[4] & 0xff)));
        return result.toString();
    }
	public int read() throws IOException
	{
		if (pos == 8) {
			if (round == 0)
				return -1;
			if (round < 5) {			// 末尾补填逗号
				if (++round == 5)
					round = 0;
				return 44;
			}
			byte[] next = new byte[5];
			round = in.readNBytes(next, 0, 5);
			if (round == 0)
				return -1;
			out = base48(next);
			pos = 0;
		}
		return out.charAt(pos++);
	}
	public int read(char[] cbuf, int off, int len) throws IOException
	{
		for (int i = 0; i < len; ++i) {
			int next = this.read();
			if (next == -1)
				return i;
			cbuf[off++] = (char)next;
		}
		return len;
	}
	public void close() throws IOException
	{
		in.close();
	}
}

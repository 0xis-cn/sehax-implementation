package fit.matling.sehax;

import java.util.Map;
import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

public class Sehax45s {
    private static final int[] gfbiao = new int[]{
        0, 11, 27, 19, 43, 3, 35, 1, 47, 13, 46, 18, 36, 40, 17, 34, 15, 4, 29, 8, 14, 9, 44, 6, 7,
        48, 26, 21, 33, 45, 2, 24, 31, 30, 20, 41, 38, 32, 5, 28, 39, 10, 25, 16, 12, 42, 22, 37, 23};
    private static final int[] igfbiao0 = new int[]{
        3, 1, 4, 0, 2, 5, 3, 3, 2, 3, 5, 0, 6, 1, 2, 2, 6, 2, 1, 0, 4, 3, 6, 6, 4,
        6, 3, 0, 5, 2, 4, 4, 5, 4, 2, 0, 1, 6, 5, 5, 1, 5, 6, 0, 3, 4, 1, 1, 3};
    private static final int[] igfbiao1 = new int[]{
        4, 0, 2, 5, 3, 3, 2, 3, 5, 0, 6, 1, 2, 2, 6, 2, 1, 0, 4, 3, 6, 6, 4, 6, 3,
        0, 5, 2, 4, 4, 5, 4, 2, 0, 1, 6, 5, 5, 1, 5, 6, 0, 3, 4, 1, 1, 3, 1, 4};
    private static final int[] x2se = new int[]{
        33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33,
        33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 29, 33, 7,  33, 9,  6,  35, 13, 16, 8,  14, 45, 36, 21, 33, 33, 33, 33, 33, 33,
        33, 37, 12, 33, 5,  44, 24, 33, 17, 33, 33, 33, 39, 33, 26, 33, 33, 33, 33, 33, 9,  33, 15, 33, 33, 19, 33, 33, 33, 33, 33, 33,
        33, 31, 30, 43, 28, 20, 11, 47, 48, 41, 3,  40, 25, 23, 10, 42, 18, 21, 1,  2,  4,  27, 32, 38, 22, 46, 34, 33, 33, 33, 33, 33};
    private static final int[] enc1 = new int[]{6,
            1, 6, 5, 5, 1, 5, 1, 0, 3, 5, 2, 4, 6, 5, 3, 5, 6, 5, 1, 3, 3, 5, 0, 2, 3, 6, 0, 2, 3, 0, 3, 5, 0, 4, 0,
            2, 6, 4, 0, 5, 6, 5, 4, 6, 0, 0, 2, 5, 5, 2, 5, 4, 1, 0, 2, 5, 4, 0, 6, 6, 4, 1, 2, 0, 6, 4, 0, 2, 6, 3,
            1, 3, 6, 2, 6, 2, 1, 0, 2, 3, 6, 1, 6, 2, 1, 3, 2, 5, 1, 1, 1, 6, 0, 1, 4, 5, 6, 2, 0, 0, 1, 0, 1, 2, 0,
            4, 4, 4, 6, 2, 5, 3, 5, 2, 1, 3, 0, 6, 2, 0, 5, 6, 6, 4, 3, 0, 3, 3, 4, 5, 6, 2, 5, 0, 4, 1, 5, 4, 4, 4,
            3, 6, 3, 1, 2, 1, 3, 1, 2, 2, 2, 4, 2, 2, 5, 6, 2, 2, 4, 5, 6, 2, 1, 1, 0, 3, 3, 5, 6, 4, 3, 4, 0, 6, 0,
            6, 4, 1, 6, 6, 4, 5, 2, 5, 5, 2, 5, 2, 4, 5, 6, 6, 0, 0, 1, 0, 5, 3, 6, 2, 6, 2, 2, 2, 1, 6, 5, 4, 0, 2,
            6, 5, 3, 5, 6, 5, 1, 4, 2, 5, 1, 4, 3, 4, 2, 5, 6, 5, 0, 3, 5, 5, 6, 6, 0, 3, 0, 2, 2, 6, 0, 3, 0, 3, 6,
            2, 1, 2, 3, 3, 6, 4, 3, 2, 3, 4, 3, 5, 1, 6, 2, 6, 4, 3, 6, 5, 0, 4, 0, 2, 5, 0, 2, 3, 2, 4, 3, 4, 0, 2,
            6, 6, 3, 2, 1, 5, 6, 6, 6, 5, 6, 4, 3, 6, 2, 6, 5, 5, 4, 4, 5, 4, 4, 5, 6, 1, 2, 2, 3, 6, 0, 1, 4, 5, 6,
            2, 6, 0, 4, 0, 6, 6, 3, 5, 6, 1, 6, 5, 3, 1, 2, 2, 3, 0, 5, 5, 1, 4, 1, 4, 6, 5, 3, 5, 6, 5, 1, 6, 1, 6,
            4, 3, 6, 1, 2, 0, 3, 2, 0};
    private static final int[] enc2 = new int[]{2,
            3, 1, 3, 5, 1, 2, 3, 2, 2, 6, 5, 5, 6, 2, 0, 3, 4, 2, 5, 2, 1, 3, 3, 2, 6, 2, 1, 6, 6, 1, 5, 5, 1, 0, 2,
            5, 2, 1, 1, 6, 5, 5, 6, 5, 1, 0, 1, 1, 6, 1, 1, 5, 6, 1, 2, 4, 0, 5, 2, 5, 6, 3, 1, 6, 0, 1, 0, 6, 3, 4,
            6, 5, 0, 6, 6, 2, 0, 2, 3, 6, 0, 3, 2, 4, 3, 1, 3, 3, 6, 2, 1, 3, 5, 5, 6, 2, 5, 6, 4, 5, 1, 4, 2, 5, 6,
            5, 1, 0, 4, 0, 2, 5, 6, 4, 6, 1, 3, 6, 0, 4, 1, 2, 3, 6, 0, 3, 2, 4, 3, 4, 2, 4, 6, 5, 4, 4, 6, 2, 5, 2,
            2, 6, 2, 2, 1, 0, 3, 3, 6, 4, 3, 1, 5, 4, 0, 2, 6, 3, 5, 5, 6, 5, 0, 2, 4, 2, 5, 5, 1, 3, 1, 4, 3, 1, 4,
            5, 6, 2, 1, 3, 4, 6, 0, 6, 2, 6, 4, 1, 2, 0, 6, 5, 1, 3, 0, 2, 5, 1, 4, 0, 1, 3, 6, 1, 2, 3, 0, 3, 6, 5,
            0, 6, 1, 4, 4, 6, 2, 4, 1, 4, 5, 6, 5, 5, 6, 4, 3, 0, 5, 1, 6, 2, 3, 3, 4, 5, 6, 2, 0, 4, 6, 2, 5, 3, 3,
            5, 6, 4, 3, 0, 5, 1, 2, 0, 3, 2, 1, 2, 3, 4, 6, 5, 2, 5, 6, 1, 1, 5, 1, 0, 2, 5, 6, 4, 1, 2, 3, 1, 6, 4,
            0, 1, 1, 5, 6, 5, 4, 2, 3, 5, 5, 5, 0, 4, 2, 5, 6, 2, 5, 5, 3, 5, 6, 5, 2, 2, 3, 3, 6, 6, 0, 1, 4, 5, 6,
            6, 0, 1, 0, 2, 3, 2, 1, 2, 3, 3, 6, 2, 1, 4, 0, 2, 6, 5, 1, 4, 6, 5, 4, 3, 2, 5, 2, 3, 4, 0, 2, 6, 2, 6,
            6, 5, 1, 2, 1, 2, 3, 0, 5};

    private static class AutoIter {
        private int[] data;

        AutoIter(int[] data) {
            this.data = data;
        }

        public int[] getData() {
            return data;
        }

        private static int r0(int a, int b) {
            return (a - b + 7) % 7;
        }

        private static final int[][] tab = new int[][]{
                new int[]{0, 3, 6, 1, 5, 4, 2},
                new int[]{0, 5, 3, 2, 6, 1, 4},
                new int[]{0, 4, 1, 5, 2, 6, 3}
        };

        private static int r12(int a, int b, int ind) {
            if (a == b)
                return ind != 2 ? a : (-a + 7) % 7;
            return (Math.min(a, b) + tab[ind][Math.abs(a - b)]) % 7;
        }

        public AutoIter repeat(int mode, int times) {
            while (times-- > 0) {
                data[0] = data[data.length - 2];
                data[data.length - 1] = data[1];
                int[] next = new int[data.length];
                for (int i = 1; i < data.length - 1; i++)
                    next[i] = r12(r0(data[i - 1], data[i]), r0(data[i], data[i + 1]), mode);
                data = next;
            }
            return this;
        }
    }

    /**
     * 用于元素乘法。. 以下为原注：
     *
     * @param sh 是对应得到的代表希顶字母的编
     * @param x1 是上面随机编码中取的
     * @param x2 是上面随机编码中取的
     * @return 用于元素乘法
     */
    private static int elmult(int sh, int x1, int x2) {
        return (gfbiao[sh] + gfbiao[x1 * 7 + x2]) % 48;
    }


    public int[] digestUnguarded(String input, boolean timed) throws IOException {
		return digestUnguarded(new StringReader(input), timed);
	}

	private static void fillSeventh(int pos, int code, int cycle, int[] left, int[] right) {
		int lpos = elmult(code, enc1[pos + cycle], enc1[pos + 1 + cycle]);
		int rpos = elmult(code, enc2[pos + cycle], enc2[pos + 1 + cycle]);
		left [pos + 1]	= igfbiao0[lpos];
		left [pos + 2]	= igfbiao1[lpos];
		right[pos + 1]	= igfbiao0[rpos];
		right[pos + 2]	= igfbiao1[rpos];
	}

    /**
     * 计算 SEHAX45 的主流程，无卫语句。.
     *
     * @param input 输入串，要求仅含有允许字符
     * @param timed 插入时间戳
     * @return 所得数组
     */
    public int[] digestUnguarded(Reader input, boolean timed) throws IOException {
		int[] left = new int[182], right = new int[182];
		int remainder = 0, cycle = 0;
reading:
		while (true) {
			for (int i = 0; i < 180; i += 2) {
				int character = input.read();
				if (character == -1) {
					remainder = i;
					break reading;
				}
				fillSeventh(i, x2se[character], cycle, left, right);
			}
			cycle = 180 ^ cycle;
		}
		input.close();
        if (timed) {
            int[] stamp = new SeptDate().sept();
            for (int i = 0; i < 8; ++i) {
                left [remainder + 1] += stamp[i];
				right[remainder + 1] += stamp[i];
				if (++remainder == 180)
					remainder = 0;
            }
        }
		if (remainder != 0) {
			while (remainder != 180) {
				fillSeventh(remainder, 33, cycle, left, right);
				remainder += 2;
			}
		}
		for (int i = 1; i < 181; i++) {
			left[i] %= 7;
			right[i] %= 7;
		}
        left  = new AutoIter(left ).repeat(0, 12).getData();
        right = new AutoIter(right).repeat(1, 12).getData();
        right[0] = right[180];      		// 使下方可用模数来取
        int[] outIter = new int[182];
        for (int i = 1; i < 181; i++)
            outIter[i] = (right[(11 + i) % 180] + left[i]) % 7;
        outIter = new AutoIter(outIter).repeat(2, 12).getData();
        int[] result = new int[45];
        for (int i = 0; i < 45; i++)
            result[i] = (outIter[i + 1] + outIter[i + 46] + outIter[i + 91] + outIter[i + 136]) % 7;
        return result;
    }
}

package fit.matling.sehax;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class Sehax45s {
    private static final int[] gfbiao = new int[]{0, 11, 27, 19, 43, 3, 35, 1, 47, 13, 46, 18, 36, 40, 17, 34, 15, 4, 29, 8, 14, 9, 44, 6, 7, 48, 26, 21, 33, 45, 2, 24, 31, 30, 20, 41, 38, 32, 5, 28, 39, 10, 25, 16, 12, 42, 22, 37, 23,};
    private static final int[] igfbiao0 = new int[]{3, 1, 4, 0, 2, 5, 3, 3, 2, 3, 5, 0, 6, 1, 2, 2, 6, 2, 1, 0, 4, 3, 6, 6, 4, 6, 3, 0, 5, 2, 4, 4, 5, 4, 2, 0, 1, 6, 5, 5, 1, 5, 6, 0, 3, 4, 1, 1, 3};
    private static final int[] igfbiao1 = new int[]{4, 0, 2, 5, 3, 3, 2, 3, 5, 0, 6, 1, 2, 2, 6, 2, 1, 0, 4, 3, 6, 6, 4, 6, 3, 0, 5, 2, 4, 4, 5, 4, 2, 0, 1, 6, 5, 5, 1, 5, 6, 0, 3, 4, 1, 1, 3, 1, 4};
    private static final Map<Character, Integer> x2se = ImmutableMap.<Character, Integer>builder(
    ).put('b', 30).put('p', 18).put('m', 23).put('w', 38).put('j', 3).put('q', 21).put(
            'x', 22).put('y', 46).put('n', 10).put('z', 34).put('D', 5).put('s', 2).put('r', 1).put(
            'H', 17).put('N', 26).put('l', 25).put('d', 28).put('t', 4).put('g', 47).put('k', 40).put(
            'h', 48).put('4', 16).put('5', 8).put('v', 32).put('F', 24).put('7', 45).put('B', 12).put(
            'c', 43).put('f', 11).put('u', 27).put('a', 31).put('o', 42).put('e', 20).put('E', 44).put(
            'A', 37).put('Y', 19).put('L', 39).put('6', 14).put('2', 35).put('T', 9).put('8', 36).put(
            '3', 13).put('V', 15).put('1', 6).put('i', 41).put(' ', 33).put(',', 29).put('.', 7).put(
            '9', 21).put('0', 9).build();
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

    /**
     * 计算 SEHAX45 的主流程，无卫语句。.
     *
     * @param input 输入串，要求仅含有允许字符
     * @param timed 插入时间戳
     * @return 所得数组
     */
    public int[] digestUnguarded(String input, boolean timed) {
        int fullLength = 90 * (1 + (4 + input.length()) / 90);
        String lengthened = input + String.format("%0" + (fullLength - input.length()) + "d", 0
        ).replace('0', ' ');    // 后面插入 suffixSpace 个空格
        int[] left = new int[2 * fullLength], right = new int[2 * fullLength];
        for (int i = 0; i < fullLength; i++) {
            int i2 = 2 * i, i21 = 2 * i + 1, character;
            try {
                character = x2se.get(lengthened.charAt(i));
            } catch (NullPointerException e) {
                character = 33;
            }
            int leftPos = elmult(character, enc1[i2 % 360], enc1[i21 % 360]);
            int rightPos = elmult(character, enc2[i2 % 360], enc2[i21 % 360]);
            left[i2] = igfbiao0[leftPos];
            left[i21] = igfbiao1[leftPos];
            right[i2] = igfbiao0[rightPos];
            right[i21] = igfbiao1[rightPos];
        }
        if (timed) {
            int[] stamp = new SeptDate().sept();
            for (int i = 0; i < 8; ++i) {
                int pos = 2 * input.length() + i;
                left[pos] = stamp[i] = right[pos] = stamp[i];
            }
        }
        if (left.length > 180) {
            for (int i = left.length - 1; i >= 180; i--) {
                left[i - 180] += left[i];
                right[i - 180] += right[i];
            }
            for (int i = 0; i < 180; i++) {
                left[i] %= 7;
                right[i] %= 7;
            }
        }
        int[] leftIter = new int[182], rightIter = new int[182];
        System.arraycopy(left, 0, leftIter, 1, 180);
        System.arraycopy(right, 0, rightIter, 1, 180);
        leftIter = new AutoIter(leftIter).repeat(0, 12).getData();
        rightIter = new AutoIter(rightIter).repeat(1, 12).getData();
        rightIter[0] = rightIter[180];      // 使下方可用模数来取
        int[] outIter = new int[182];
        for (int i = 1; i < 181; i++)
            outIter[i] = (rightIter[(11 + i) % 180] + leftIter[i]) % 7;
        outIter = new AutoIter(outIter).repeat(2, 12).getData();
        int[] result = new int[45];
        for (int i = 0; i < 45; i++)
            result[i] = (outIter[i + 1] + outIter[i + 46] + outIter[i + 91] + outIter[i + 136]) % 7;
        return result;
    }
}

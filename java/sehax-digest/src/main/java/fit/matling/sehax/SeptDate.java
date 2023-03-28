package fit.matling.sehax;

import java.util.Date;

public class SeptDate extends Date {
    public SeptDate() {
        super();
    }
    public SeptDate(long millisec) {
        super(millisec);
    }
    public int[] sept() {
        /*
         到七历历元日数
         FIXME 向零取整使得 1996-01-28 以前日期错误
        */
        long days = 1_706_816 + (getTime() - 822_758_400_000L) / 86_400;
        int[] result = new int[8];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = (int) ((1 + days) % 7);
            days /= 7;
        }
        return result;
    }
}

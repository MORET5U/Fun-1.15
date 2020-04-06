package me.Defracted;

import java.util.Comparator;

public class Utils {
    public static boolean isNum(String strNum) {
        try {
            Integer.parseInt(strNum);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Comparator<String> ALPHABETICAL_ORDER = (str1, str2) -> {
        int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
        if (res == 0) {
            res = str1.compareTo(str2);
        }
        return res;
    };
}

package com.shilovich.core;

import com.shilovich.gt.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for (String number : str) {
            if (!StringUtils.isPositiveNumber(number)) {
                return false;
            }
        }
        return true;
    }
}

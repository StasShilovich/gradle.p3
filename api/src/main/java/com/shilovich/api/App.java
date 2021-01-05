package com.shilovich.api;

import com.shilovich.core.Utils;

public class App {
    public static void main(String[] args) {
        boolean condition = Utils.isAllPositiveNumbers("12", "79");
        System.out.println(condition);
    }
}
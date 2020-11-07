package ru.dsvinka;

import javax.swing.*;

public class Main extends JOptionPane {
    public static void main(String[] args) {
        String result = showInputDialog(null, "Введите Число", "Что-то для конкурса", PLAIN_MESSAGE);

        if (result == null) {
            System.exit(0);
        }
        int number = Integer.parseInt(result);

        int zeros = 0, c = 2;

        while ((int) Math.floor(number / c) >= 1) {
            zeros += (int) Math.floor(number / c);
            c *= 2;
        }

        showMessageDialog(null, "Результат: " + zeros, "Результат Вычислений", PLAIN_MESSAGE);
    }
}

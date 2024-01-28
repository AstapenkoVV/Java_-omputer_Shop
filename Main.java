package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Задание
 *
 * -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * - Создать множество ноутбуков.
 * - Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 * фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
 * хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * - Далее нужно запросить минимальные значения для указанных критериев - сохранить
 * параметры фильтрации можно также в Map.
 * - Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */

public class Main {
    public static void main(String[] args) {
        Set<Laptop> notebooks = new HashSet<>();
        Laptop notebook1 = new Laptop(15, "HP", "intel", 8, 128, "DOS");
        Laptop notebook2 = new Laptop(15, "ASUS", "AMD", 8, 256, "Windows");
        Laptop notebook3 = new Laptop(14, "DELL", "intel", 16, 512, "Linux");
        Laptop notebook4 = new Laptop(17, "ACER", "AMD", 32, 1024, "Windows");
        Laptop notebook5 = new Laptop(15, "Apple", "A1", 8, 256, "MacOS");
        Laptop notebook6 = new Laptop(14, "Apple", "A2", 16, 512, "MacOS");
        Laptop notebook7 = new Laptop(17, "DELL", "AMD", 32, 1024, "Windows");
        Laptop notebook8 = new Laptop(14, "HP", "intel", 16, 128, "DOS");

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);

    }
}
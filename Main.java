package org.example;

/**
 * Задание
 * <p>
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

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Laptop> notebooks = new HashSet<>();
        Laptop notebook1 = new Laptop(15, "HP", "INTEL", 8, 128, "DOS");
        Laptop notebook2 = new Laptop(15, "ASUS", "AMD", 8, 256, "WINDOWS");
        Laptop notebook3 = new Laptop(14, "DELL", "INTEL", 16, 512, "LINUX");
        Laptop notebook4 = new Laptop(17, "ASUS", "AMD", 32, 1024, "WINDOWS");
        Laptop notebook5 = new Laptop(15, "APPLE", "A1", 8, 256, "MACOS");
        Laptop notebook6 = new Laptop(14, "APPLE", "A2", 16, 512, "MACOS");
        Laptop notebook7 = new Laptop(17, "DELL", "AMD", 32, 1024, "WINDOWS");
        Laptop notebook8 = new Laptop(14, "HP", "INTEL", 16, 128, "DOS");

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);

        int choiceNumber;
        String choiceValue;
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> savedChoice = new HashMap<>();
        List<Integer> listChoiceNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 0));
        //TODO Сделать дополнительную проверку на вводимые параметры характеристик
        System.out.println("--- ФИЛЬТР ПО НОУТБУКАМ ---\n" +
                "Выберите характеристики, соответствующие вашему запросу:\n" +
                "1 - Размер экрана (дюймы) / 14 / 15 / 17 /\n" +
                "2 - Бренд / HP / ASUS / DELL / APPLE /\n" +
                "3 - Процессор / INTEL / AMD / A1 / A2 /\n" +
                "4 - Объем оперативной памяти (Гб) / 8 / 16 / 32 /\n" +
                "5 - Объем жесткого диска (Гб) / 128 / 256 / 512 / 1024 /\n" +
                "6 - Операционная система / DOS / LINUX / WINDOWS / MACOS /\n" +
                "0 - Применить фильтр");

        do {
            System.out.println("Введите номер характеристки: ");
            choiceNumber = scanner.nextInt();
            scanner.nextLine();
            if ((listChoiceNumber.contains(choiceNumber)) && (choiceNumber != 0)) {
                System.out.println("Введите параметр характеристки №" + choiceNumber + ":");
                choiceValue = scanner.nextLine().toUpperCase();
                savedChoice.put(choiceNumber, choiceValue);
            }
            else {
                System.out.println("Вы ввели неверный номер характеристики!");
                System.out.println();
            }
        }
        while (choiceNumber != 0);

        Set<Laptop> notebooksFilter = topFilter(notebooks, savedChoice);
        for (Laptop notebook : notebooksFilter) {
            System.out.println(notebook);
        }
        System.out.println("Прекрасный выбор!");
    }


    public static Set<Laptop> outputFilter(Set<Laptop> notebooks, int choiceNumber, String choiceValue) {
        Set<Laptop> filterByLaptops = new HashSet<>();
        for (Laptop laptop : notebooks) {
            switch (choiceNumber) {
                case 1:
                    if (laptop.getLaptopDisplayDiagonal() == Integer.parseInt(choiceValue)) {
                        filterByLaptops.add(laptop);
                    }
                    break;
                case 2:
                    if (laptop.getLaptopBrand().equalsIgnoreCase(choiceValue)) {
                        filterByLaptops.add(laptop);
                    }
                    break;
                case 3:
                    if (laptop.getLaptopCpu().equalsIgnoreCase(choiceValue)) {
                        filterByLaptops.add(laptop);
                    }
                    break;
                case 4:
                    if (laptop.getLaptopRam() == Integer.parseInt(choiceValue)) {
                        filterByLaptops.add(laptop);
                    }
                    break;
                case 5:
                    if (laptop.getLaptopStorageDisk() == Integer.parseInt(choiceValue)) {
                        filterByLaptops.add(laptop);
                    }
                    break;
                case 6:
                    if (laptop.getLaptopOs().equalsIgnoreCase(choiceValue)) {
                        filterByLaptops.add(laptop);
                    }
                    break;
            }
        }
        return filterByLaptops;
    }


    public static Set<Laptop> topFilter(Set<Laptop> notebooks, Map<Integer, String> allFilters) {
        Set<Laptop> filterByNotebooks = new HashSet<>(notebooks);
        for (Map.Entry<Integer, String> filter : allFilters.entrySet()) {
            int choiceNumber = filter.getKey();
            String choiceValue = filter.getValue();
            filterByNotebooks = outputFilter(filterByNotebooks, choiceNumber, choiceValue);
        }
        return filterByNotebooks;
    }
}
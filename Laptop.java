package org.example;

public class Laptop {
    private int laptopDisplayDiagonal;
    private String laptopBrand;
    private String laptopCpu;
    private int laptopRam;
    private int laptopStorageDisk;
    private String laptopOs;


    public Laptop(int laptopDisplayDiagonal,
                  String laptopBrand,
                  String laptopCpu,
                  int laptopRam,
                  int laptopStorageDisk,
                  String laptopOs) {
        this.laptopDisplayDiagonal = laptopDisplayDiagonal;
        this.laptopBrand = laptopBrand;
        this.laptopCpu = laptopCpu;
        this.laptopRam = laptopRam;
        this.laptopStorageDisk = laptopStorageDisk;
        this.laptopOs = laptopOs;
    }

    public int getLaptopDisplayDiagonal() {
        return laptopDisplayDiagonal;
    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public String getLaptopCpu() {
        return laptopCpu;
    }

    public int getLaptopRam() {
        return laptopRam;
    }

    public int getLaptopStorageDisk() {
        return laptopStorageDisk;
    }

    public String getLaptopOs() {
        return laptopOs;
    }

    @Override
    public String toString() {
        return "Размер экрана: " + laptopDisplayDiagonal +
                " дюймов. Бренд: " + laptopBrand +
                ". Процессор: " + laptopCpu +
                ". Объем оперативной памяти: " + laptopRam +
                "Гб. Объем жесткого диска: " + laptopStorageDisk +
                "Гб. Операционная система: " + laptopOs;
    }
}

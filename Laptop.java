package org.example;

public class Laptop {
    private double laptopDisplayDiagonal;
    private String laptopBrand;
    private String laptopCpu;
    private int laptopRam;
    private int laptopStorageDisk;
    private String laptopOs;


    public Laptop(double laptopDisplayDiagonal,
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

    public double getLaptopDisplayDiagonal() {
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
}

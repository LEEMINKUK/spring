package com.ohgiraffers.remix;

import java.util.Date;

public class ProductAndRentalDTO {

    private RentalDTO idJoin;
    private String model;
    private String ram;
    private String ssd;
    private String brand;
    private Date productDate;
    private int id;

    public ProductAndRentalDTO() {}

    public ProductAndRentalDTO(RentalDTO idJoin, String model, String ram, String ssd, String brand, Date productDate, int id) {
        this.idJoin = idJoin;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.productDate = productDate;
        this.id = id;
    }

    public RentalDTO getIdJoin() {
        return idJoin;
    }

    public void setIdJoin(RentalDTO idJoin) {
        this.idJoin = idJoin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductAndRentalDTO{" +
                idJoin +
                ", model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", brand='" + brand + '\'' +
                ", productDate=" + productDate +
                '}';
    }
}

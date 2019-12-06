package com.qf.projectfinal.po;


import java.util.Date;

public class Product {

    private int productId;
    private String productName;
    private String productRate;
    private Date productDate;
    private String productImg;

    public Product(int productId, String productName, String productRate, Date productDate, String productImg) {
        this.productId = productId;
        this.productName = productName;
        this.productRate = productRate;
        this.productDate = productDate;
        this.productImg = productImg;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductRate() {
        return productRate;
    }

    public void setProductRate(String productRate) {
        this.productRate = productRate;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productRate='" + productRate + '\'' +
                ", productDate=" + productDate +
                ", productImg='" + productImg + '\'' +
                '}';
    }
}

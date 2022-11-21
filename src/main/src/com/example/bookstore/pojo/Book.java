package com.example.bookstore.pojo;

public class Book implements Cloneable{
    private String title;
    private String author;
    private Double price;
    private Integer sales;
    private String imag = "static/imag/计算机专业英语.jpg";
    private Double stock;

    public Book(String title, String author, Double price, Integer sales, String imag, Double stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.sales = sales;
        this.imag = imag;
        this.stock = stock;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", imag='" + imag + '\'' +
                ", stock=" + stock +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }
}

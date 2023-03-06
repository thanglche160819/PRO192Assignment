/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC - Thinkpad
 */
public class Product {
    private String ProductID;
    private String ProductName;
    private double ProductPrice;
    
    public Product(){
        ProductID = "";
        ProductName = "";
        ProductPrice = 0;
    }
    
    public Product(String xID, String xName, double xPrice){
        ProductID = xID;
        ProductName = xName;
        ProductPrice = xPrice;
    }
    
    public String getProductID() {
        return ProductID;
    }

    public String getProductName() {
        return ProductName;
    }
    
    public double getProductPrice(){
        return ProductPrice;
    }
    
    public void setProductID(String ProductID){
        this.ProductID = ProductID;
    }
    
    public void setProductName(String ProductName){
        this.ProductName = ProductName;
    }
    
    public void setProductID(double xPrice){
        ProductPrice = xPrice;
    }
    
    @Override
    public String toString(){
        return ProductID + "," + ProductName + "," + ProductPrice + "\n";
    }
    
    
    
}

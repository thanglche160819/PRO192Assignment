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
    private String ProductName;
    private String ProductID;
    private double ProductPrice;
    
    public Product(){
    
    }
    
    public Product(String xProductName, String xProductID, double xProductPrice){
        ProductID = xProductID;
        ProductName = xProductName;
        ProductPrice = xProductPrice;
    }
    
    public String getProductName(){
        return ProductName;
    }
    
    public String getProductID(){
        return ProductID;
    }
    
    public double getProductPrice(){
        return ProductPrice;
    }
    
    public void setProductName(String ProductName){
        this.ProductName = ProductName;
    }
    
    public void setProductID(String ProductID){
        this.ProductID = ProductID;
    }
    
    public void setProductPrice(double ProductPrice){
        this.ProductPrice = ProductPrice;
    }
    
    @Override
    public String toString(){
        return ProductID + ", " + ProductName +", " + ProductPrice + "\n";
    }
    
}

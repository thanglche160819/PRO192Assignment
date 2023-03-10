
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC - Thinkpad
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String xProductID ="";
        String xProductName ="";
        double xProductPrice = 0;
        int ProductAddNumber = 0;
        System.out.println("Enter number of product you want to add: ");
        ProductAddNumber = sc.nextInt();sc.nextLine();
        List<Product> t = new ArrayList();
        for (int i=0;i<ProductAddNumber;i++){
            System.out.println("Enter the ID: ");
            xProductID = sc.nextLine();
            System.out.println("Enter the name of Product");
            xProductName = sc.nextLine();
            System.out.println("Enter the price: ");
            xProductPrice = sc.nextDouble(); sc.nextLine();
            t.add(new Product(xProductID, xProductName, xProductPrice));
        }
        System.out.println("Product list: ");
        System.out.println("ID     Name     Price");
        for (Product x : t){
            System.out.printf("%s      %s        %g",x.getProductID(),x.getProductName(),x.getProductPrice());
            System.out.println("\n");
        }
        
        
        
    }
    
}

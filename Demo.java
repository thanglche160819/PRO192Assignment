
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
public class Demo {
    public static void dispList(List<Product> t) {
       for(Product x : t) {
           System.out.printf("(%s,%s,%f)\n",x.getProductID(),x.getProductName(),x.getProductPrice());
       }
       System.out.printf("\r\n");
     } 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Product> t = new ArrayList();
        String xID = "";String xName = "";double xPrice = 0;
        String cID = "";double cPrice = 0;
        int tc;          
        do {
            System.out.println("Select your choice: ");
            tc = sc.nextInt();sc.nextLine();
            if (tc == 1){
                System.out.println("Add your number of product: ");
                int n = sc.nextInt();
                sc.nextLine();      
                for (int i=0;i<n;i++){
                System.out.println("Enter ID: ");
                xID = sc.nextLine();
                System.out.println("Enter Name: ");
                xName = sc.nextLine();
                System.out.println("Enter Price: ");
                xPrice = sc.nextDouble();
                t.add(new Product(xID, xName, xPrice));
                sc.nextLine();
                }
            } else if (tc == 3){
                System.out.println("List of Products: ");
                dispList(t);
            } else if (tc == 2){
                System.out.println("Select Product: ");
                int n = sc.nextInt();
                sc.nextLine();
                cPrice = sc.nextDouble();sc.nextLine();
                t.replace(n, "a", "a", cPrice);
            }
        } while (tc != 0);
        
    }
    
}

import java.util.*;
interface BillInterface{
    void getdetails();
    void displaydetails();
}

class Product implements BillInterface{
    int productid;
    String name;
    int quantity;
    double unitprice;
    double total;
    Scanner sc = new Scanner(System.in);
    public void getdetails() {
        System.out.print("Product ID: ");
        productid = sc.nextInt();
        sc.nextLine();
        System.out.print("Product Name: ");
        name = sc.nextLine();
        System.out.print("Product Quantity: ");
        quantity = sc.nextInt();
        System.out.print("Unit Price: ");
        unitprice = sc.nextDouble();
        total = quantity * unitprice;
    }
    public void displaydetails(){
        System.out.printf("%-10d %-15s %-10d %-10.2f %-10.2f\n",productid, name, quantity, unitprice, total);
    }
}

class Order implements BillInterface {
    int orderNo;
    int Count;
    Product[] products;
    double netAmount = 0;
    Scanner sc = new Scanner(System.in);
    public void getdetails() {
        System.out.print("Enter number of products : ");
        Count = sc.nextInt();
        products = new Product[Count];
        for (int i = 0; i < Count; i++) {
            System.out.println("\nEnter details for Product : " + (i + 1));
            products[i] = new Product();
            products[i].getdetails();
            netAmount += products[i].total;
        }
    }
    public void displaydetails(){
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n","ID", "Name", "Quantity", "Price", "Total");
        System.out.println("-------------------------------------------------------------");
        for (Product p:products){
            p.displaydetails();
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Net Amount: %.2f\n", netAmount);
    }
}

public class Bill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of orders: ");
        int n = sc.nextInt();
        Order[] orders = new Order[n];
        for (int i=0;i<n;i++){
            System.out.println("\n--- Enter details for Order " + (i + 1) + " ---");
            orders[i] = new Order();
            orders[i].getdetails();
        }
        System.out.println("\n=========== BILL ===========");
        for (Order o:orders) {
            o.displaydetails();
        }
    }
}

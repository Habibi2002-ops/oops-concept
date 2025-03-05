class Product{
   String pcode;
   String pname;
   double price;
 public void setProduct(String productCode,String productName,double productPrice){
   pcode = productCode;
   pname = productName;
   price = productPrice;
}

public double getPrice(){
 return price;
}

public void displayProduct(){
  System.out.println("Product Code:"+pcode);
  System.out.println("Product Name:"+pname);
  System.out.println("Product Price:"+price);
}
}

public class Main{
  public static void main(String args[]){
    Product product1 = new Product();
    product1.setProduct("P001","Product1",100.0);
    
    Product product2 = new Product();
    product2.setProduct("P002","Product2",50.0);

    Product product3 = new Product();
    product3.setProduct("P003","Poduct3",150.0);

    Product lowestPriceProduct = product1;
    
    if(product2.getPrice()<lowestPriceProduct.getPrice()){
      lowestPriceProduct = product2;
      }
     if(product3.getPrice()<lowestPriceProduct.getPrice()){
      lowestPriceProduct = product3;
      }
     System.out.println("\n Product with the lowest pice:");
     lowestPriceProduct.displayProduct();
}
}
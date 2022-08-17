abstract class Products {

    private String pID;
    private String name;
    private double price;
  
    public void setProductDetails(String pID, String name, double price) {
      this.pID = pID;
      this.name = name;
      this.price = price;
    }
  
    public void printProductDetails() {
      System.out.println(" product id : " + this.pID);
      System.out.println(" name       : " + this.name);
      System.out.println(" price      : " + this.price);
    }
  }
  
  class LedTv extends Products {
  
    private String brand;
    private String technology;
  
    public void setProductDetails(
      String pID,
      String name,
      double price,
      String brand,
      String technology
    ) {
      super.setProductDetails(pID, name, price);
      this.brand = brand;
      this.technology = technology;
    }
  
    public void printProductDetails() {
      System.out.println("");
      super.printProductDetails();
      System.out.println(" brand      : " + this.brand);
      System.out.println(" technology : " + this.technology);
    }
  }
  
  class MobilePhone extends Products {
  
    private String ram;
    private String os;
    private String sdCard;
  
    public void setProductDetails(
      String pID,
      String name,
      double price,
      String ram,
      String os,
      String sdCard
    ) {
      super.setProductDetails(pID, name, price);
      this.ram = ram;
      this.os = os;
      this.sdCard = sdCard;
    }
  
    public void printProductDetails() {
      System.out.println("");
      
      super.printProductDetails();
  
      System.out.println(" ram        : " + this.ram);
      System.out.println(" os         : " + this.os);
      System.out.println(" sdCard     : " + this.sdCard);
  
      
      System.out.println("");
    }
  }

  public class Main {
  
    public static void main(String[] args) {
      LedTv newled = new LedTv();
  
      newled.setProductDetails(
        "ilo8625j42",
        "Toshiba TV",
        560000.00,
        "Toshiba",
        "Toshiba-group-tec"
      );
  
      newled.printProductDetails();
  
      MobilePhone newMobile = new MobilePhone();
      newMobile.setProductDetails(
        "cft56o4",
        "Huawei y7",
         41000.00,
        "8GB",
        "Huawei",
        "32GB"
      );
      newMobile.printProductDetails();
    }
}

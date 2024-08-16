class Product{
    String productId;
    String productName;
    String category;
    double unitePrice;
    int quantitySold;
    double salesAmount;

    public Product(String productId, String productName,String category,double unitPrice,int quntitySold){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.unitePrice = unitPrice;
        this.quantitySold = quntitySold;
        this.salesAmount = salesAmount;
    }
    public String toString(){
        return productId + " " +productName + " " + category + " " + unitePrice + " " + quantitySold +" " + salesAmount + " " ; 
    }
}
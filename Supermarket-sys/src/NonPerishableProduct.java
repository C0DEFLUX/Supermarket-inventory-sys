class NonPerishableProduct extends Product
{
    private String warrantyPeriod;

    //Sets the values of non-perishable product
    public NonPerishableProduct(String productId, String name, double price, int quantity, String warrantyPeriod)
    {
        super(productId, name, price, quantity);
        this.warrantyPeriod = warrantyPeriod;
    }
    //Method for getting warranty
    public String getWarrantyPeriod()
    {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod)
    {
        //Check if there is a warranty period
        if (warrantyPeriod != null && !warrantyPeriod.isEmpty())
        {
            this.warrantyPeriod = warrantyPeriod;
        }
    }

    //Method for returning the product info
    @Override
    public String getProductInfo()
    {
        return "Product ID: " + getProductId() +
                ", Name: " + getName() +
                ", Price: " + getPrice() +
                ", Quantity: " + getQuantity() +
                ", Warranty Period: " + warrantyPeriod;
    }
}

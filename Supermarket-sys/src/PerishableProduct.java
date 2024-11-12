class PerishableProduct extends Product
{
    private String expiryDate;
    //Set values for perishable product
    public PerishableProduct(String productId, String name, double price, int quantity, String expiryDate)
    {
        super(productId, name, price, quantity);
        this.expiryDate = expiryDate;
    }
    //Get the expiry date
    public String getExpiryDate()
    {
        return expiryDate;
    }
    //Set the expiry date
    public void setExpiryDate(String expiryDate)
    {
        if (expiryDate != null && !expiryDate.isEmpty())
        {
            this.expiryDate = expiryDate;
        }
    }
    //Return the product info
    @Override
    public String getProductInfo()
    {
        return "Product ID: " + getProductId() +
                ", Name: " + getName() +
                ", Price: " + getPrice() +
                ", Quantity: " + getQuantity() +
                ", Expiry Date: " + expiryDate;
    }
}


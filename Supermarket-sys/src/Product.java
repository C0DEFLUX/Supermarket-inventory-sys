abstract class Product
{
    private String productId;
    private String name;
    private double price;
    private int quantity;

    //Set the product values
    public Product(String productId, String name, double price, int quantity)
    {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //Method for getting productId
    public String getProductId()
    {
        return productId;
    }

    //Method to set productId
    public void setProductId(String productId)
    {
        if (productId != null && !productId.isEmpty())
        {
            this.productId = productId;
        }
    }
    //Return the name
    public String getName()
    {
        return name;
    }
    //Set the name
    public void setName(String name)
    {
        if (name != null && !name.isEmpty())
        {
            this.name = name;
        }
    }
    //Get the price
    public double getPrice()
    {
        return price;
    }
    //Set the price
    public void setPrice(double price)
    {
        if (price >= 0)
        {
            this.price = price;
        }
    }
    //Get quantity
    public int getQuantity()
    {
        return quantity;
    }
    //Set quantity
    public void setQuantity(int quantity)
    {
        if (quantity >= 0)
        {
            this.quantity = quantity;
        }
    }
    //Method to restock
    public void restock(int amount)
    {
        if (amount > 0)
        {
            this.quantity += amount;
        }
    }

    public abstract String getProductInfo();
}

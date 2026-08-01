public class RestaurantBilling 
{
    //Static V  ariable to count orders 
    static int totalOrder = 0 ;
    
    
    //Dine in 
    double bill(double amount)
    {
        totalOrder++;
        return amount;
    }

    //Takeaway Bill
    double bill(double amount , double packingCharge)
    {
        totalOrder++;
        return amount + packingCharge;
    }

    //Delivery Bill
    double bill(double amount , double packingCharge , double deliveryCharge)
    {
        totalOrder++;
        return amount + packingCharge + deliveryCharge;
    }

    //Static Methods
    static void showOrders()
    {
        System.out.println("Total Orders =" + totalOrder);
    }

    public static void main(String[] args) {

        RestaurantBilling r = new RestaurantBilling();

        System.out.println("Dine-in Bill = " + r.bill(500));
        System.out.println("Takeaway Bill = " + r.bill(500, 30));
        System.out.println("Delivery Bill = " + r.bill(500, 30, 50));

        RestaurantBilling.showOrders();
    }




}

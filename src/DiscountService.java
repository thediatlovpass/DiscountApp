public class DiscountService {

    public double getDiscount(Client client, double price) {
        if (client.isPremium()) {
            return getPremiumDiscount(price);
        } else
            return getStandardDiscount(price);
    }

    double getPremiumDiscount(double price) {
        if(price > 1000)
            return  applyDiscount(price, 0.15);
        else
            return applyDiscount(price,0.05);
    }
    double getStandardDiscount(double price) {
        if(price > 1000)
        return applyDiscount(price,0.10);
        else
            return price;
    }

    double applyDiscount(double price, double discount){
        return price *(1 - discount);
    }


}

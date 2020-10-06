package inheritance.lagersystem;

import java.util.Date;

public class FoodItem extends Item {
    private Date expires;

    public FoodItem(String name, double price) {
        super(name, price);
    }

    public FoodItem(String name, double price, Date expires) {
        super(name, price);
        this.setExpires(expires);
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return String.format("FoodItem{name: %s, price: %.2f, expires: %s}", this.getName(), this.getPrice(), this.getExpires());
    }
}

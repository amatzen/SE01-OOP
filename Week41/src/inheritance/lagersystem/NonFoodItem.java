package inheritance.lagersystem;

import java.util.Arrays;

public class NonFoodItem extends Item {
    private String[] materials;

    public NonFoodItem(String name, double price) {
        super(name, price);
    }
    public NonFoodItem(String name, double price, String[] materials) {
        super(name, price);
        this.setMaterials(materials);
    }

    public String[] getMaterials() {
        return materials;
    }

    public void setMaterials(String[] materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return String.format("NonFoodItem{name: %s, price: %.2f, materials: %s}", this.getName(), this.getPrice(), Arrays.toString(this.getMaterials()));
    }
}

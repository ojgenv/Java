package zu.classes;

import java.util.Objects;

public class Laptop {
    Brand brand;
    Color color;
    String name;
    double cost; 

    public Laptop(Brand brand, Color color, String name, double d){
        this.brand = brand;
        this.color = color;
        this.name = name;
        this.cost = d;
    }

    public Boolean filterColor(Color filter){
        if (filter == null) return true;
        return this.color == filter;
    }
    
    public Boolean filterBrand(Brand filter){
        if (filter == null) return true;
        return this.brand == filter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, name, cost);
    }

    @Override
    public String toString() {
        return "Ноут - " +
                "Бренд: '" + brand + '\'' +
                ", название: " + name +
                ", цвет: " + color +
                ", с нашей Супер скидкой: " + cost;
    }
}
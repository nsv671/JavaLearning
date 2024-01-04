package ENUM;

public enum Toppings {
    TOMATO,
    ONION,
    CHICKEN,
    BACON,
    PICKEL;

    public double getPrice(Toppings topping){
        return  switch (topping){
            case TOMATO -> 10.5;
            case CHICKEN -> 50.0;
            case BACON -> 80.99;
            default -> 0.5;
        };
    }
}

package Homework2.task1;

public enum VideoCard {
    AMD("AMD"),
    NVIDIA("NVIDIA");

    private final String brand;

    public String getBrand() {
        return brand;
    }

    VideoCard (String brand){
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

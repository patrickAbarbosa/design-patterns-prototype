package Animals;

import java.util.Date;

public class Cow implements Cloneable {
    private String name;
    private String breed;
    private String predominantColor;

    public Cow(String name, String breed, String predominantColor){
        this.name = name;
        this.breed = breed;
        this.predominantColor = predominantColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getPredominantColor() {
        return predominantColor;
    }

    public void setPredominantColor(String predominantColor) {
        this.predominantColor = predominantColor;
    }

    @Override
    public Cow clone() throws CloneNotSupportedException {
        Cow newCow = (Cow) super.clone();

        return newCow;
    }
}

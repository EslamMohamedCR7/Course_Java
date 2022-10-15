package EX11_01;

import java.util.Date;

public class GeometricObject {

    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;

    public GeometricObject() {
        this("white", false);
    }

    public GeometricObject(String Color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on : " + dateCreated + "\n\tColor Is : "
                + color + " and Filled Is : " + filled + ".\n";
    }
}

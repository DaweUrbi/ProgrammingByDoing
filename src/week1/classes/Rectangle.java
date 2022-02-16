package week1.classes;

public class Rectangle {
    // fields
    int width;
    int height;
    String color;

    Rectangle() {
        this.width = 1;
        this.height = 1;
        this.color = Blue;
    }

    public void setColor(String color){
        if (color.length() > 2 && color.length() <= 20) {
            this.color = color;
        }
    }

    Rectangle(int newWidth, int newHeight, String newColor) {
        width = newWidth;
        height = newHeight;
        color = newColor;
    }

    void draw()





}




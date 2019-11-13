import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.io.File;


public class DPad extends ImageView {

    private final String path = "resources/";
    private Image img;
    private double xTouchPoint;
    private double yTouchPoint;

    public DPad(double x, double y, double width, double height) {
        img = new Image("file:" + path + "dpad.png", width, height, true, false);

        setImage(img);

        setFitHeight(height);
        setFitWidth(width);
        setX(x);
        setY(y);
        setOpacity(0.65);

        setOnMouseMoved(event -> {
            xTouchPoint = event.getX();
            yTouchPoint = event.getY();

            setOpacity(1.0);
            if(xTouchPoint >= x && xTouchPoint <= x + width/3) {
                if(yTouchPoint >= y && yTouchPoint <= y + height/3) {
                    //Izquierda arriba
                    System.out.println("Izquierda arriba");
                } else if(yTouchPoint >= y + height/3 && yTouchPoint <= y + 2*height/3) {
                    //Izquierda
                    System.out.println("Izquierda");
                } else if(yTouchPoint >= y + 2*height/3 && yTouchPoint <= y + height) {
                    //Izquierda abajo
                    System.out.println("Izquierda abajo");
                }
            } else if(xTouchPoint >= x + 2*width/3 && xTouchPoint <= x + width) {
                if(yTouchPoint >= y && yTouchPoint <= y + height/3) {
                    //Derecha arriba
                    System.out.println("Derecha arriba");
                } else if(yTouchPoint >= y + height/3 && yTouchPoint <= y + 2*height/3) {
                    //Derecha
                    System.out.println("Derecha");
                } else if(yTouchPoint >= y + 2*height/3 && yTouchPoint <= y + height) {
                    //Derecha
                    System.out.println("Derecha abajo");
                }
            } else if(xTouchPoint >= x + width/3 && xTouchPoint <= x + 2*width/3) {
                if(yTouchPoint >= y && yTouchPoint <= y + height/3) {
                    //Arriba
                    System.out.println("Arriba");
                } else if(yTouchPoint >= y + height/3 && yTouchPoint <= y + 2*height/3) {
                    //Centro
                } else if(yTouchPoint >= y + 2*height/3 && yTouchPoint <= y + height) {
                    //Abajo
                    System.out.println("Abajo");
                }
            }
        });

        setOnMouseExited(event -> {
            setOpacity(0.65);
        });
    }
}

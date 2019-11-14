import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Button extends ImageView {

    private Image img;
    private String name;

    public Button(double x, double y, double width, double height, String image) {
        img = new Image("file:" + image, width, height, true, false);

        setImage(img);

        setFitHeight(height);
        setFitWidth(width);
        setX(x);
        setY(y);
        setOpacity(0.65);

        //Esto se usa para pruebas, si ocupas distintos botones con distintas funcionalidades entonces
        //debes declarar por separado y utlizado la referencia al objeto para definir la funcionalidad.
        setOnMousePressed(event -> {
            setOpacity(1.0);
            System.out.println("Pressed " + name + "!");
            //Lo que quieres que haga cuando lo presionas.
        });

        setOnMouseReleased(event -> {
            setOpacity(0.65);
            System.out.println("Released " + name + "!");
            //Lo que quieres que haga cuando lo sueltas.
        });

    }

    public void setName(String name) {
        this.name = name;
    }

}

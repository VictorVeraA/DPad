import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DPadTest extends Application {

    private DPad dpad;

    @Override
    public void start(Stage primaryStage) throws Exception {


        Group grupo = new Group();
        Scene escena = new Scene(grupo, 1024, 600);


        dpad = new DPad(50, 50, 150, 150);

        Image img = new Image("file:resources/dpad.png");

        DPad dpad2 = new DPad(100, 500, 500, 72);

        DPad dpad3 = new DPad(220, 50, 400, 400);

        grupo.getChildren().add(dpad);
        grupo.getChildren().add(dpad2);
        grupo.getChildren().add(dpad3);

        primaryStage.setScene(escena);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.centerOnScreen();
        primaryStage.requestFocus();
        primaryStage.setTitle("PPP - Pepenadores Post 'Pocalipticos");
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}

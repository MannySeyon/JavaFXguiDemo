package mans.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/* Creation of a Fx Sandwich
Bread = Stage
Meat = Scene
Toppings = Nodes
Enjoy the Meal!
*/

public class Main extends Application {
    //Initialize Application classes Launch Method
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    //Set Stage(Window) (First)
    public void start(Stage cntrStage1) throws IOException {

        //Create Group type root node(Layout)
        Group root = new Group();
        // Create Scene-Pass a Root Node to the scene
        //Pass color/Size to Scene
        Scene scene1 = new Scene(root, Color.DEEPSKYBLUE);
        //Pass scene to the stage
        cntrStage1.setScene(scene1);

        //Create Text Node/Set String in Method or Separate setMethod
        Text text1 = new Text("First Text Block");
        //text1.setTextContent();

        //Set Location of Text
         text1.setX( 620);
         text1.setY(450);
        //Set Font/Size
        text1.setFont(Font.font("Papyrus",60));
        //Set text Fill
        text1.setFill(Color.BURLYWOOD);
        //Pass Text Node to root Node-To Display in Scene/On Screen
        root.getChildren().add(text1);

        //Set Line Node
        Line line1 = new Line();
        //Set Location (This one is a horizontal line)
        line1.setStartX(620);
        line1.setStartY(460);
        line1.setEndX(1360);
        line1.setEndY(460);
        line1.setStrokeWidth(3);
        line1.setStroke(Color.LIGHTSKYBLUE);
        //0-1.0
        line1.setOpacity(0.5);
        //Rotate
        line1.setRotate(5);
        //Pass Line Node to Root Node
        root.getChildren().add(line1);

        //Create Circle
        Circle circle1 = new Circle();
        circle1.setCenterX(100);
        circle1.setCenterY(100);
        circle1.setStrokeWidth(2);
        circle1.setRadius(50);
        circle1.setFill(Color.BURLYWOOD);
        circle1.setStroke(Color.BLACK);
        //Pass Circle NOde to Root Node
        root.getChildren().add(circle1);

        //Create A Triangle
       Polygon tri = new Polygon();
       //Set Its Points
       tri.getPoints().setAll(
               200.0,200.0,
                300.0,300.0,
               200.0,300.0
            );
       tri.setFill(Color.BLACK);
       tri.setOpacity(.5);
       //Pass Triangle to root Node
        root.getChildren().add(tri);

        //Add Image
        Image lakpaLLC = new Image("C:\\Users\\Emmanuel Seyon\\IdeaProjects\\demo\\src\\xoxo.png" );
        //Pass Image to Stage(Windows Label Pic)
        cntrStage1.getIcons().add(lakpaLLC);

        //Add Image to Scene
        Image lakpaLLC2 = new Image("C:\\Users\\Emmanuel Seyon\\IdeaProjects\\demo\\src\\xoxo.png" );
        ImageView imageView = new ImageView(lakpaLLC2);
        imageView.setX(1500);
        imageView.setY(100);
        //imageView.set
        root.getChildren().add(imageView);

        //Set Stage Title(Window Label)
        cntrStage1.setTitle("Stage Demo Skirt-Skirt");

        /*Set Size of Window (Overrides the scene Sizing Values)
        cntrStage1.setWidth(666);
        cntrStage1.setHeight(420);
        */

       // Make resizable or not
        //cntrStage1.setResizable(false);


        /* Set Location on Monitor Screen
        cntrStage1.setX(10);
        cntrStage1.setY(10);
        */

       //Set Fullscreen Boolean
        //cntrStage1.setFullScreen(true);

        //Change Exit Screen hint & Exit Key
        cntrStage1.setFullScreenExitHint("You Can't Escape! Mua Hah Hah." + " JK Hit Q, To quit!");
        cntrStage1.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        //Show the Stage (Last)
        cntrStage1.show();


//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

    }
}

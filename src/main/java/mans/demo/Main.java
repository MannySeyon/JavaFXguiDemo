package mans.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
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
        // Create Scene-Pass Node to the scene
        //Pass color to Scene
        Scene scene1 = new Scene(root, 800, 800, Color.LIGHTSKYBLUE);

        //Create Text Object/Set in Initializing method or in Set Method
        //Text text1 = new Text("This is the First Text Block");
        //text1.setTextContent();
        //Set Location of Text
       // text1.setX(50);
        //text1.setY(50);

        //Pass scene to the stage
        cntrStage1.setScene(scene1);

        //Add Image
        Image lakpaLLC = new Image("C:\\Users\\Emmanuel Seyon\\IdeaProjects\\demo\\src\\xoxo.png" );
        //Pass Image to Stage(Windows Label Pic)
        cntrStage1.getIcons().add(lakpaLLC);

        //Set Stage Title(Window Label)
        cntrStage1.setTitle("Stage Demo Skirt Skirt");

        /*Set Size of Window (Overrides the scene Sizing Values)
        cntrStage1.setWidth(666);
        cntrStage1.setHeight(420);
        */

        /* Make resizable or not
        ntrStage1.setResizable(True or False);
         */

        /* Set Location on Monitor Screen
        cntrStage1.setX(10);
        cntrStage1.setY(10);
        */

       //Set Fullscreen Boolean
        cntrStage1.setFullScreen(true);

        //Change Exit Screen hint & Exit Key
        cntrStage1.setFullScreenExitHint("You Can't Escape! Mua Hah Hah" + " JK Hit Q, To quit!");
        cntrStage1.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        //Show the Stage (Last)
        cntrStage1.show();


//
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//
//
//
//    }

    }
}

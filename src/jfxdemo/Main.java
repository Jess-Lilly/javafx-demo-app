/*
 * Author: djskrien
 * Date: 9/6/2016
 * Instructions for IntelliJ project setup: https://www.jetbrains.com/help/idea/javafx.html
 */
package jfxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application // VERSION 1
{
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();
        button.setText("Click Me");

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}


/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application // VERSION 2
{
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();
        button.setText("Click Me");
        button.addEventHandler(ActionEvent.ACTION, new MyButtonEventHandler());

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}

class MyButtonEventHandler implements EventHandler<ActionEvent>
{
    @Override
    public void handle(ActionEvent event) {
        ((Button) event.getSource()).setText("Leave me alone!");
    }
}
*/


/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application // VERSION 3
{
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();
        button.setText("Click Me");
        button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) {
                button.setText("Leave me alone!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/

/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application // VERSION 4
{
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button();
        button.setText("Click Me");
        button.addEventHandler(ActionEvent.ACTION,
                event -> button.setText("Leave me alone!"));
        // or even better: button.setOnAction(event -> button.setText("Leave me alone!"));

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/

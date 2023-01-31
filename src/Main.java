import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Application.launch(BackAndForthApplication.class, "--width=400", "--height=300");
    }
}

/*  Launching Parameters-------------
 Application.launch(JavaFxApplication.class,
        "--organization=Once upon a time",
        "--course=Title"); */


         /*extends Application {

    @Override
    public void start(Stage window) {
        TextField leftText = new TextField();
        TextField rightText = new TextField();
        Button button = new Button("Copy");

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });

        leftText.textProperty().addListener(new ChangeListener<String>() { //mirror text +print
            @Override
            public void changed(ObservableValue<? extends String> change,
                                String oldValue, String newValue) {

                System.out.println(oldValue + " -> " + newValue);
                rightText.setText(newValue);
            }
        });


        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene viewport = new Scene(componentGroup);

        window.setScene(viewport);
        window.show();
    }
    public static void main(String[] args) {
        launch(Main.class);
    }
}


        BorderPane layout = new BorderPane();

        Button button = new Button("This is a button");
        button.setOnAction((event) -> {    //lambda: takes parameters and returns a value, method
            System.out.println("Pressed!");
        });

        layout.setCenter(button);

        Scene view = new Scene(layout);

        window.setScene(view);
        //window.setTitle("Hello World");

        Button button = new Button("This is a button");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Pressed!");
            }
        });

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Button("First"));
        buttons.getChildren().add(new Button("Second"));
        buttons.getChildren().add(new Button("Third"));

        VBox texts = new VBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("First"));
        texts.getChildren().add(new Label("Second"));
        texts.getChildren().add(new Label("Third"));

        for (int x=  1; x<=3; x++) {
            for(int y = 1; y <= 3; y++) {
                layout.add(new Button("" + x + "," + y), x, y);
            }
        }
        VBox layout = new VBox();
        //HBox layout = new HBox();
        layout.setSpacing(10);

        layout.getChildren().add(new Label("first"));
        layout.getChildren().add(new Label("second"));
        layout.getChildren().add(new Label("third"));

         Button button = new Button("This is a button");
        Label textComponent = new Label("Text element");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textComponent);
        BorderPane layout = new BorderPane();


        layout.setTop(new Label("top"));
        layout.setRight(new Label("right"));
        layout.setBottom(new Label("bottom"));
        layout.setLeft(new Label("left"));
        layout.setCenter(new Label("center"));

        layout.setTop(buttons);
        layout.setLeft(texts);*/


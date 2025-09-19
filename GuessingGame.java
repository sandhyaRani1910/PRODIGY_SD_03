import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;

public class GuessingGame extends Application {

    private int randomNumber;
    private int attempts;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Guess the Number");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label lblInstruction = new Label("Guess a number between 1 and 100:");
        TextField txtGuess = new TextField();
        Button btnGuess = new Button("Guess");
        Label lblFeedback = new Label();
        lblFeedback.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        grid.add(lblInstruction, 0, 0, 2, 1);
        grid.add(txtGuess, 0, 1);
        grid.add(btnGuess, 1, 1);
        grid.add(lblFeedback, 0, 2, 2, 1);

        startNewGame();

        btnGuess.setOnAction(e -> {
            try {
                int guess = Integer.parseInt(txtGuess.getText());
                attempts++;
                if (guess < randomNumber) {
                    lblFeedback.setText("low! Try again.");
                    lblFeedback.setStyle("-fx-text-fill: blue;");
                } else if (guess > randomNumber) {
                    lblFeedback.setText("high! Try again.");
                    lblFeedback.setStyle("-fx-text-fill: red;");
                } else {
                    lblFeedback.setText("Correct! Attempts: " + attempts);
                    lblFeedback.setStyle("-fx-text-fill: green;");
                    startNewGame();
                }
                txtGuess.clear();
            } catch (NumberFormatException ex) {
                lblFeedback.setText("Please enter a valid number!");
                lblFeedback.setStyle("-fx-text-fill: orange;");
            }
        });

        Scene scene = new Scene(grid, 400, 200);
        stage.setScene(scene);
        stage.show();
    }

    private void startNewGame() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
        attempts = 0;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

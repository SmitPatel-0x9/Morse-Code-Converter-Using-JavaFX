import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverterFX extends Application {

    private Map<Character, String> morseCodeMap;

    @Override
    public void start(Stage primaryStage) {
        morseCodeMap = createMorseCodeMap();

        // Input and output fields with labels
        Label inputLabel = new Label("Input Text:");
        TextField inputField = new TextField();
        Label outputLabel = new Label("Converted Text:");
        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);

        // Buttons for conversion
        Button toMorseButton = new Button("To Morse");
        Button toEnglishButton = new Button("To English");

        // Clipboard and clear buttons
        Button copyButton = new Button("Copy Output");
        Button pasteButton = new Button("Paste Text");
        Button clearInputButton = new Button("Clear Input");
        Button clearOutputButton = new Button("Clear Output");

        // Morse code sheet button
        Button sheetButton = new Button("Morse Code Sheet");

        // Set tooltips for buttons
        toMorseButton.setTooltip(new Tooltip("Convert text to Morse code"));
        toEnglishButton.setTooltip(new Tooltip("Convert Morse code to English"));
        copyButton.setTooltip(new Tooltip("Copy the output text to clipboard"));
        pasteButton.setTooltip(new Tooltip("Paste text from clipboard"));
        clearInputButton.setTooltip(new Tooltip("Clear the input field"));
        clearOutputButton.setTooltip(new Tooltip("Clear the output field"));
        sheetButton.setTooltip(new Tooltip("View the Morse Code sheet"));

        // Event handlers
        toMorseButton.setOnAction(e -> {
            String input = inputField.getText();
            String morse = convertToMorse(input.toUpperCase());
            outputArea.setText(morse);
        });

        toEnglishButton.setOnAction(e -> {
            String input = inputField.getText();
            String english = convertToEnglish(input);
            outputArea.setText(english);
        });

        copyButton.setOnAction(e -> {
            ClipboardContent content = new ClipboardContent();
            content.putString(outputArea.getText());
            Clipboard.getSystemClipboard().setContent(content);
        });

        pasteButton.setOnAction(e -> {
            Clipboard clipboard = Clipboard.getSystemClipboard();
            if (clipboard.hasString()) {
                inputField.setText(clipboard.getString());
            }
        });

        clearInputButton.setOnAction(e -> inputField.clear());
        clearOutputButton.setOnAction(e -> outputArea.clear());

        sheetButton.setOnAction(e -> showMorseCodeSheet());

        // Layout adjustments with HBox and VBox
        HBox conversionBox = new HBox(10, toMorseButton, toEnglishButton);
        HBox clipboardBox = new HBox(10, copyButton, pasteButton, clearInputButton, clearOutputButton);

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15));
        layout.getChildren().addAll(inputLabel, inputField, conversionBox, outputLabel, outputArea, clipboardBox, sheetButton);

        // Scene and stage setup
        Scene scene = new Scene(layout, 450, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Morse Code Converter");
        primaryStage.show();
    }

    // Morse code mapping
    private Map<Character, String> createMorseCodeMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('A', ".-");
        map.put('B', "-...");
        map.put('C', "-.-.");
        map.put('D', "-..");
        map.put('E', ".");
        map.put('F', "..-.");
        map.put('G', "--.");
        map.put('H', "....");
        map.put('I', "..");
        map.put('J', ".---");
        map.put('K', "-.-");
        map.put('L', ".-..");
        map.put('M', "--");
        map.put('N', "-.");
        map.put('O', "---");
        map.put('P', ".--.");
        map.put('Q', "--.-");
        map.put('R', ".-.");
        map.put('S', "...");
        map.put('T', "-");
        map.put('U', "..-");
        map.put('V', "...-");
        map.put('W', ".--");
        map.put('X', "-..-");
        map.put('Y', "-.--");
        map.put('Z', "--..");
        map.put('0', "-----");
        map.put('1', ".----");
        map.put('2', "..---");
        map.put('3', "...--");
        map.put('4', "....-");
        map.put('5', ".....");
        map.put('6', "-....");
        map.put('7', "--...");
        map.put('8', "---..");
        map.put('9', "----.");
        return map;
    }

    // Convert text to Morse code
    private String convertToMorse(String text) {
        StringBuilder morseBuilder = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                morseBuilder.append("/ ");
            } else {
                String morseChar = morseCodeMap.get(c);
                if (morseChar != null) {
                    morseBuilder.append(morseChar).append(" ");
                }
            }
        }
        return morseBuilder.toString();
    }

    // Convert Morse code to English
    private String convertToEnglish(String morse) {
        StringBuilder englishBuilder = new StringBuilder();
        String[] words = morse.split("   ");
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                boolean found = false;
                for (Map.Entry<Character, String> entry : morseCodeMap.entrySet()) {
                    if (entry.getValue().equals(letter)) {
                        englishBuilder.append(entry.getKey());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    englishBuilder.append("?");
                }
            }
            englishBuilder.append(" ");
        }
        return englishBuilder.toString();
    }

    // Show Morse Code Sheet
    private void showMorseCodeSheet() {
        Stage sheetStage = new Stage();
        sheetStage.setTitle("Morse Code Sheet");

        TableView<Map.Entry<Character, String>> tableView = new TableView<>();
        TableColumn<Map.Entry<Character, String>, String> letterColumn = new TableColumn<>("Letter");
        letterColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getKey().toString()));

        TableColumn<Map.Entry<Character, String>, String> morseColumn = new TableColumn<>("Morse Code");
        morseColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getValue()));

        tableView.getColumns().add(letterColumn);
        tableView.getColumns().add(morseColumn);
        tableView.getItems().addAll(morseCodeMap.entrySet());

        VBox vbox = new VBox(tableView);
        Scene sheetScene = new Scene(vbox, 300, 400);
        sheetStage.setScene(sheetScene);
        sheetStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

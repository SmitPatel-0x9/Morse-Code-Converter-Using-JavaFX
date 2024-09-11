Morse Code Converter

   A JavaFX application for converting text to Morse code and vice versa. The application includes features for copying text to the          clipboard, pasting from the clipboard, clearing input and output fields, and viewing a Morse code reference sheet.

Features
   - Convert to Morse Code: Input English text and get the Morse code equivalent.
   - Convert to English: Input Morse code and get the English translation.
   - Copy to Clipboard: Copy the converted text to the clipboard.
   - Paste from Clipboard: Paste text from the clipboard into the input field.
   - Clear Input and Output: Clear the text fields and output area.
   - Morse Code Sheet: View a reference sheet showing Morse code for each letter and number.

Installation

   1. Clone the repository:
      ```bash
      git clone https://github.com/yourusername/MorseCodeConverter.git
      cd MorseCodeConverter

   2. Set up JavaFX:
      Make sure you have JavaFX set up in your development environment.
      Add the JavaFX library to your project's build path.

   3. Compile and run the application:
      javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml MorseCodeConverterFX.java
      java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml MorseCodeConverterFX
      Replace /path/to/javafx-sdk/lib with the path to your JavaFX SDK library.

Usage
   1. Enter Text: Input text into the "Input Text" field.
   2. Convert: Click "To Morse" to convert to Morse code or "To English" to convert Morse code to English.
   3. Copy and Paste: Use the "Copy Output" button to copy the output to the clipboard or "Paste Text" to paste from the clipboard.
   4. Clear Fields: Use "Clear Input" to clear the input field and "Clear Output" to clear the output area.
   5. View Morse Code Sheet: Click "Morse Code Sheet" to open a window displaying a reference sheet of Morse code.

Screenshots
   -Main Application Window [Main Application Window.png]
   -English to Morse Code Conversion [English to Morse Code.png]
   -Morse Code to English Conversion [Morse Code to English.png]
   -Morse Code Sheet [Morse Code sheet.png]

Authors
   Smit Patel

Technologies Used
   -JavaFX
   -Java

Future Features
   -Add support for different languages.
   -Enhance UI with more themes and styles.
   -Implement a feature to save and load text conversions.

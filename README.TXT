Morse Code Converter

A JavaFX application for converting text to Morse code and vice versa. The application includes features for copying text to the clipboard, pasting from the clipboard, clearing input and output fields, and viewing a Morse code reference sheet.

## Features

- **Convert to Morse Code:** Input English text and get the Morse code equivalent.
- **Convert to English:** Input Morse code and get the English translation.
- **Copy to Clipboard:** Copy the converted text to the clipboard.
- **Paste from Clipboard:** Paste text from the clipboard into the input field.
- **Clear Input and Output:** Clear the text fields and output area.
- **Morse Code Sheet:** View a reference sheet showing Morse code for each letter and number.

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/MorseCodeConverter.git
   cd MorseCodeConverter

Set up JavaFX:

Make sure you have JavaFX set up in your development environment.
Add the JavaFX library to your project's build path.
Compile and run the application:

bash
Copy code
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml MorseCodeConverterFX.java
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml MorseCodeConverterFX
Replace /path/to/javafx-sdk/lib with the path to your JavaFX SDK library.

Usage
Enter Text: Input text into the "Input Text" field.
Convert: Click "To Morse" to convert to Morse code or "To English" to convert Morse code to English.
Copy and Paste: Use the "Copy Output" button to copy the output to the clipboard or "Paste Text" to paste from the clipboard.
Clear Fields: Use "Clear Input" to clear the input field and "Clear Output" to clear the output area.
View Morse Code Sheet: Click "Morse Code Sheet" to open a window displaying a reference sheet of Morse code.
Screenshots
Main Application

Morse Code Sheet

Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.
Create a new branch (git checkout -b feature/your-feature).
Commit your changes (git commit -m 'Add some feature').
Push to the branch (git push origin feature/your-feature).
Create a new Pull Request.
License
This project is licensed under the MIT License. See the LICENSE file for more details.

Authors
Your Name
Technologies Used
JavaFX
Java
Future Features
Add support for different languages.
Enhance UI with more themes and styles.
Implement a feature to save and load text conversions.


### Notes:
1. **Replace placeholders** like `https://github.com/yourusername/MorseCodeConverter.git` and `Your Name` with your actual GitHub repository URL and your name, respectively.
2. **Add screenshots** for the "Main Application" and "Morse Code Sheet" sections. You can take screenshots of your application and name them appropriately (e.g., `screenshot-main.png`).
3. **JavaFX Setup**: Adjust the setup instructions based on how users are expected to configure JavaFX in their environment.

Feel free to modify the content to better fit your project’s specifics and your personal preferences!


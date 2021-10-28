module io.github.alihabibian.sudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.alihabibian.sudoku to javafx.fxml;
    exports io.github.alihabibian.sudoku;
}
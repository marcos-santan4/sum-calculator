module com.example.newtest2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newtest2 to javafx.fxml;
    exports com.example.newtest2;
    exports com.example.newtest2.gui.util;
    opens com.example.newtest2.gui.util to javafx.fxml;
}
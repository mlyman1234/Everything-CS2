module edu.westga.cs1302.combobox {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens edu.westga.cs1302.combobox.views to javafx.fxml;
    exports edu.westga.cs1302.combobox;
}

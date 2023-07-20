module com.example.projectavocatnew {
    requires javafx.controls;
    requires javafx.fxml;
            
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.projectavocatnew to javafx.fxml;
    exports com.example.projectavocatnew;
}
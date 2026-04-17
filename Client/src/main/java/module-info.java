module com.redwood.client {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.redwood.client to javafx.fxml;
    exports com.redwood.client;
}
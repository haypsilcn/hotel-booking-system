module haypsilcn.hotelbookingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens haypsilcn.hotelbookingsystem to javafx.fxml;
    exports haypsilcn.hotelbookingsystem;
}
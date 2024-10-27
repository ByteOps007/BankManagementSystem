module BankManagementSystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens your.package.name to javafx.fxml;
    exports your.package.name;
}
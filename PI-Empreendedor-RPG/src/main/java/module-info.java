module com.example.piempreendedorrpg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.piempreendedorrpg to javafx.fxml;
    exports com.example.piempreendedorrpg;
}
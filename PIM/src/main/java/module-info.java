module e_commerce {
    requires javafx.fxml;
    requires javafx.controls;
    requires org.controlsfx.controls;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires org.apache.commons.text;
    requires org.json;

    opens sem2pim to javafx.fxml, javafx.graphics;
    exports PIM.presentation;
}

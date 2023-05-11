module example {
    requires org.json;
    requires java.net.http;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;
    requires net.harawata.appdirs;
    requires org.jfxtras.styles.jmetro;

    opens ui to javafx.fxml;

    exports ui;
}
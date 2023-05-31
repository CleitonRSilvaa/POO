module br.senacsp {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.senacsp to javafx.fxml;
    exports br.senacsp;
}

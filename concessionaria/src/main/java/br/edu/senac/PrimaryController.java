package br.edu.senac;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML private TextField textMarca;
    @FXML private TextField textAno;
    @FXML private TextField textPreco;
    @FXML private TextArea lista;

    List<Carro> carros = new ArrayList<>();
    
    public void gravarCarro(){
      var carro =  new Carro( 
            textMarca.getText(),
            Integer.valueOf(textAno.getText()),
            new BigDecimal(textPreco.getText())
        );
        carros.add(carro);
        textAno.setText(null);
        textPreco.setText(null);
        textMarca.setText(null);

        mostrarCarro(); 
    }

    private void mostrarCarro() {
        lista.clear();
        carros.forEach(c -> lista.appendText(c.toString() + "\n"));
    }

    public void ordernarPorAno(){
        
        carros.sort((c1,c2)-> Integer.compare(c1.getAno(), c2.getAno()));
        mostrarCarro();
    }




}
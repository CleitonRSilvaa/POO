package service;

import model.Recurso;
import model.Usuario;

public class RegraAutenticar extends RegraService {

  @Override
  public String validarRegra(Usuario usuario, String senha, Recurso recurso) {
    return "Acesso concedido ao recurso " + recurso.getNome();
  }
  
}

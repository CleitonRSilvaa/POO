package service;

import model.Recurso;
import model.Usuario;

public class RegraSituacao extends RegraService {

  @Override
  public String validarRegra(Usuario usuario, String senha, Recurso recurso) {
    if(!recurso.isAtivo())
      return "Recurso " + recurso.getNome() + " inativo";
    return next.validarRegra(usuario, senha,recurso);      
  }
  
}

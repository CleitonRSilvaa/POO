package service;

import model.Recurso;
import model.Usuario;

public class RegraPerfil extends RegraService {

  @Override
  public String validarRegra(Usuario usuario, String senha, Recurso recurso) {
    // TODO Auto-generated method stub
    if(!usuario.getPerfil().equals(recurso.getPerfilNecessario()))
      return "Acesso negado ao recurso " + recurso.getNome();

    return next.validarRegra(usuario, senha,recurso);    
  }
  
}

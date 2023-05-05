package service;

import model.Recurso;
import model.Usuario;

public class RegraSenha extends RegraService {

  @Override
  public String validarRegra(Usuario usuario, String senha, Recurso recurso) {
    if (!usuario.getSenha().equals(senha))
      return "Senha inválida";
    return next.validarRegra(usuario, senha,recurso);
   
  }

}

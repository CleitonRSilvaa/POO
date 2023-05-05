package service;

import model.Recurso;
import model.Usuario;

public abstract class RegraService {

  protected RegraService next;

  public abstract String validarRegra(Usuario usuario, String senha, Recurso recurso);

  public RegraService proximo(RegraService regraService){
    this.next = regraService;
    return this;
  }
  



  
}

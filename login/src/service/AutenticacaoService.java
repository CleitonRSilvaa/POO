package service;

import model.Recurso;
import model.Usuario;

public class AutenticacaoService {
    public String autenticar(Usuario usuario, String senha, Recurso recurso){

        return new RegraSenha()
        .proximo(new RegraPerfil())
        .proximo(new RegraSituacao())
        .proximo(new RegraAutenticar())
        .validarRegra(usuario,senha,recurso);

        
    }
}

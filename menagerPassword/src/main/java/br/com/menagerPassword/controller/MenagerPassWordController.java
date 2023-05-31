package br.com.menagerPassword.controller;

import br.com.menagerPassword.model.PassWord;
import br.com.menagerPassword.repository.PassWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class MenagerPassWordController {

    @Autowired
    PassWordRepository repository;


    @GetMapping("/")
    private String listarSenhas(Model model){
        var passwords = repository.findAll();
        model.addAttribute("listaSenhas", passwords);
        return "index";
    }

    @PostMapping("/senha")
    private String salvarSenha (PassWord pw){
        repository.save(pw);
        return "redirect:/";
    }

    @DeleteMapping("/senha")
    private String deleteSenha(Long id, RedirectAttributes redirect){
        repository.deleteById(id);
       String mgs = "Senha deletada com sucesso";
        redirect.addFlashAttribute("mensagem", mgs);
        return "redirect:/";
    }

    private  String scriptMensagemAlertJs() {
        String mgs = 
        "Swal.fire({\n" +
        "  position: 'top-end',\n" +
        "  icon: 'success',\n" +
        "  title: 'Senha deletada com sucesso',\n" +
        "  showConfirmButton: false,\n" +
        "  timer: 1700\n" +
        "});"; 
        return mgs;
    }

    


}

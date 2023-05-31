package br.com.menagerPassword.repository;

import br.com.menagerPassword.model.PassWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassWordRepository extends JpaRepository<PassWord , Long> {
}

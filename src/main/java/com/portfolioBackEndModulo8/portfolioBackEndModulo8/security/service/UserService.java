/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEndModulo8.portfolioBackEndModulo8.security.service;

import com.portfolioBackEndModulo8.portfolioBackEndModulo8.security.model.User;
import com.portfolioBackEndModulo8.portfolioBackEndModulo8.security.repository.IUserRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fabricio
 */
@Service
@Transactional
public class UserService {

    @Autowired
    IUserRepository iUserRepository;

    public Optional<User> getByUserName(String userName) {
        return iUserRepository.findByUserName(userName);
    }

    public boolean existsByUserName(String userName) {
        return iUserRepository.existsByUserName(userName);
    }

    public boolean existsByEmail(String email) {
        return iUserRepository.existsByEmail(email);
    }

    public void save(User user) {
        iUserRepository.save(user);
    }

}

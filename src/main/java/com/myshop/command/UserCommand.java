/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.command;

import com.myshop.dto.UserDTO;

/**
 *
 * @author asus
 */
public class UserCommand extends AbstractCommand<UserDTO>{
    public UserCommand(){
        this.pojo = new UserDTO();
    }
}

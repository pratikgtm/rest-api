package com.practice.code.service;

import com.practice.code.dao.UserDao;
import com.practice.code.dtos.UserDTO;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by p0g00b8 on 18/04/19
 */
@RestController
@RequestMapping("/user")
public class UserService {

  @Autowired
  UserDao userDao;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  public UserDTO fetchUserDetails(@PathVariable("id") int id) {
    return userDao.fetchUserDetails(id);
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  @ResponseBody
  public UserDTO addUserDetails(@RequestBody UserDTO userDTO) {
    return userDao.addUserDetails(userDTO);
  }

}

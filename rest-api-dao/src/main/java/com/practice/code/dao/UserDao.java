package com.practice.code.dao;

import com.practice.code.dtos.UserDTO;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * Created by p0g00b8 on 18/04/19
 */
@Component
public class UserDao {

  private Map<Integer, UserDTO> database = new HashMap<>();

  public UserDTO fetchUserDetails(int id) {
      return database.get(id);
  }

  public UserDTO addUserDetails(UserDTO userDTO) {
    database.put(userDTO.getUserId(), userDTO);
    return userDTO;
  }

}

package com.practice.code.dtos;

/**
 * Created by p0g00b8 on 18/04/19
 */
public class UserDTO {

  int userId;
  String userName;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "UserDTO{" +
        "userId=" + userId +
        ", userName='" + userName + '\'' +
        '}';
  }
}

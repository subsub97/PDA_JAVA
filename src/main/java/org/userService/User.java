package org.userService;

public class User {
    private String name;
    private String userId;
    private String userPassword;


    User(String name) {
        this.name = name;
    }

    User(String id, String passWord, String name) {
        this(name);
        this.userId = id;
        this.userPassword = passWord;
    }

    public void signUp(String id, String password) {
        userId = id;
        userPassword = userPassword;
    }

    public void login(String id, String password) {
        System.out.println("아이디와 비밀번호를 입력해주세요.");

    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}

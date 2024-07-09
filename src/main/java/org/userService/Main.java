package org.userService;

import java.util.Scanner;

public class Main {
    static final int SIGNUP = 1;
    static final int LOGIN = 2;
    static final int USER_EDIT = 3;
    static final int REMOVE_MEMBER = 4;
    static final int LOGOUT = 5;
    static final int EXIT = 0;
    static final int INITIAL_VALUE = 99;

    static Scanner scanner = new Scanner(System.in);
    static UserService userService = new UserService();
    static boolean loggedIn = false;
    static User user = null;

    public static void main(String[] args) {
        int userInput = INITIAL_VALUE;

        while(userInput != EXIT) {
            System.out.println("이용하실 서비스 번호를 입력해주세요");
            userInput = Integer.parseInt(scanner.nextLine().trim());


            if(userInput == SIGNUP) {
                signUp();
            }

            if(userInput == LOGIN) {
                logIn();
            }

            if(userInput == USER_EDIT) {
                edit();
            }

            if(userInput == REMOVE_MEMBER) {
                removeMember();
            }

            if(userInput == LOGOUT) {
                logout();
            }

        }

        System.out.println("서비스가 종료되었습니다.");
    }

    public static void signUp() {
        System.out.println("가입하실 아이디와 비밀번호 이름을 (띄어쓰기로 구분하여) 입력하세요");
        System.out.println("Ex : ho97 1234 김득호");

        String signUpInfo = scanner.nextLine();

        String[] userInfo = Util.inputSpliter(signUpInfo);
        User newUser = new User(userInfo[0],userInfo[1],userInfo[2]);
        userService.signUp(newUser);
    }

    public static void logIn() {
        if(loggedIn) {
            System.out.println("이미" + user.getName() + "님께서는 로그인 상태입니다.");
            return;
        }

        System.out.println("아이디와 비밀번호를 입력해주세요");

        //[userId, userPassword, userName]
        String loginInfo = scanner.nextLine();
        String[] userInfo = Util.inputSpliter(loginInfo);

        user = userService.login(userInfo[0],userInfo[1]);

        if(user != null) {
            loggedIn = true;
        }
    }

    public static void edit() {
        if(!loggedIn) {
            System.out.println("먼저 로그인을 해주세요.");
            return;
        }

        System.out.println("회원정보 수정을 위해 모든 정보를 ID, password, 이름 순서로 입력해주세요");
        System.out.println("Ex : ho97 1234 김득호");

        String editInfo = scanner.nextLine();

        String[] userInfo = Util.inputSpliter(editInfo);
        User editUser = new User(userInfo[0],userInfo[1],userInfo[2]);
        userService.editUser(user,editUser);
    }

    public static void removeMember() {
        if(!loggedIn) {
            System.out.println("먼저 로그인을 해주세요.");
            return;
        }

        userService.removeUser(user);
        loggedIn = false;
        user = null;
    }

    public static void logout() {
        if(!loggedIn) {
            System.out.println("먼저 로그인을 해주세요.");
            return;
        }

        loggedIn = false;
        user = null;
        System.out.println("성공적으로 로그아웃 되었습니다.");
    }
}

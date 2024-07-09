package org.userService;

public class UserService {
    private final UserDAO userDAO = new UserDAO();

    // JOIN은 회원가입 -> 회원가입하려면 회원 정보를 DB에 저장해야한다.
    // DB에 저장하기 위해서는 DB에 접근해야지?
    // DB에 접근하려면 DAO가 필요한디?
    // Service 클래스에 다른 기능이 추가된다면 거기서도 UserDAO를 사용할 수 도 있으니 전역으로 하자
    // DAO 객체가 중간에 바뀔 필요가 없으니 final로하자

    public void signUp(User user) {
        userDAO.save(user);

        System.out.println(user.getName() + "님 가입을 환영합니다.");
    }

    public User login(String id, String password) {
        User user = userDAO.findById(id);

        if(user != null && user.getUserPassword().equals(password)) {
            System.out.println("성공적으로 로그인 되었습니다.");
            return user;
        }
        return null;
    }

    public void editUser(User user,User editUser) {
        userDAO.edit(user, editUser);
        System.out.println("회원 정보가 수정되었습니다.");
        System.out.println("ID : " + editUser.getUserId());
        System.out.println("PASSWORD : " + editUser.getUserPassword());
        System.out.println("NAME : " + editUser.getName());
    }

    public void removeUser(User user) {
        userDAO.remove(user);
    }
}

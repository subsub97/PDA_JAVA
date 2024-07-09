package org.userService;

import java.util.HashMap;
import java.util.Map;

public class UserDAO { // => Repsoitory
    private final Map<String, User> db = new HashMap<>();

    public void save(User user) {
        db.put(user.getUserId(), user);
    }

    public void edit(User user, User editUser) {
        if(db.containsKey(user.getUserId())) {
            db.replace(user.getUserId(),editUser);
        }
    }

    public User findById(String userId) {
        if(db.containsKey(userId)) {
            return db.get(userId);
        }
        System.out.println("아이디 또는 비밀번호를 확인해주세요");
        return null;
    }

    public void remove(User user) {
        db.remove(user.getUserId());
        System.out.println("회원탈퇴를 성공하였습니다.");
    }
}

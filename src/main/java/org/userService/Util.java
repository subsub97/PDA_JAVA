package org.userService;

public class Util {

    public static String[] inputSpliter(String input) {
        String[] result = input.split(" ");
        return result;
    }

    // 미쳤따리! Log 찍는용으로 사용하는 분들도 있다.
    public void toString(Object obj) {
        System.out.println(obj.toString());
    }
}

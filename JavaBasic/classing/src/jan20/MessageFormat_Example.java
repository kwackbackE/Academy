package jan20;

import java.text.MessageFormat;

public class MessageFormat_Example {
    public static void main(String[] args) {
        String id = "java";
        String name = "donghul";
        String tel = "010-2222-3333";

        String text = "회원 ID: {0} \n회원이름: {1} \n회원전화: {2}";
        String result1 = MessageFormat.format(text, id, name, tel);
        System.out.println(result1);
        System.out.println();

        String sql = "insert into member values( {0}, {1}, {2})";
        Object[] arguments = {"java", "dongyo", "010-2223-1111"};
        String result2 = MessageFormat.format(sql, arguments);
        System.out.println(result2);
    }
}

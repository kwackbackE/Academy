package jan17.Ex10_1;

public class TryCatchFinallRuntimeException_Example {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족");
            return;

        }

        try {
            int v1 = Integer.parseInt(data1);
            int v2 = Integer.parseInt(data2);
            int result = v1 + v2;
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환안됩니다");
        } finally {
            System.out.println("다시 실행하세요");
        }
    }
}

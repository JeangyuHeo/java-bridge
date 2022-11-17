package bridge;

public class Validator {
    public static void isNumber(String number){
        if (!number.matches("[0-9]+")){
            throw new IllegalArgumentException("[ERROR] 입력이 숫자가 아닙니다.");
        }
    }

    public static void isMoveAlpha(String alpha){
        if (!(alpha.charAt(0) == 'D' || alpha.charAt(0) == 'U')){
            throw new IllegalArgumentException("[ERROR] 이동할 칸은 U, D의 입력만 가능합니다.");
        }
    }

    public static void isRestart(String alpha){
        if(!(alpha.charAt(0) == 'R' || alpha.charAt(0) == 'Q')){
            throw new IllegalArgumentException("[ERROR] 재시작은 R, Q의 입력만 가능합니다.");
        }
    }
}

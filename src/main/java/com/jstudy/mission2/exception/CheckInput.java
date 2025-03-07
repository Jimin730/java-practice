package com.jstudy.mission2.exception;

public class CheckInput {

    public void checkUserNumInput(int num) throws UserInputError {
        if(num<0){
            throw new UserInputError("음수는 입력할 수 없습니다.");
        }
    }

    public void checkUserOperInput(char operator) throws UserInputError{
        if(operator == '+') return;
        else if (operator == '-') return;
        else if (operator == '*') return;
        else if (operator == '/') return;
        else {
            throw new UserInputError("+,-,*,/ 이외의 연산자는 사용할 수 없습니다.");
        }
    }
}

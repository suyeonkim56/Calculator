package com.example.Calculator3;

public enum OperatorType {
    PLUS("+"),MINUS("-"),MULTIPLY("*"),DIVIDE("/");

    private final String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    //operator 값으로 enum 이름값 찾아서 반환
    public static OperatorType findbyString(char operator_char)
    {
        OperatorType[] values = values();
        for(OperatorType operation : values)
        {
            if(operation.getOperator().equals(Character.toString(operator_char)))
            {
                return operation;
            }
        }
        return null;
    }

    public String getOperator() {
        return operator;
    }
}

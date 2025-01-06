package com.example.Calculator3;

public enum OperatorType {
    PLUS("+"), MINUS("-"), MULTIPLY("*"), DIVIDE("/");

    private String operator;
    OperatorType(String operator)
    {
        this.operator = operator;
    }
    public int operating(int a, int b)
    {
        return switch (this) {
            case PLUS -> a + b;
            case MINUS -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> a / b;
        };
    }
}

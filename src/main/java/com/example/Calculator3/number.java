package com.example.Calculator3;

//Number를 상속해 받는 타입을 숫자로 한정
public class number<T extends Number> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public int intValue() {
        return value.intValue();
    }


}

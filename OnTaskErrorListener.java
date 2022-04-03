package ru.netoligy;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}

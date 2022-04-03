package ru.netoligy;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
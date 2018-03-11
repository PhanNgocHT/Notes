package com.example.admin.notes.base;

public interface BaseView<T extends BasePresenter> {
    T getPresenter();

    T createPresenter();

}
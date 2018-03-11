package com.example.admin.notes.base;

public class BasePresenterImpl<T extends BaseView> implements BasePresenter {
    private T view;

    public BasePresenterImpl(T view) {
        this.view = view;
    }

    public T getView() {
        return view;
    }

}
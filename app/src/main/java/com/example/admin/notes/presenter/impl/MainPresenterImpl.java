package com.example.admin.notes.presenter.impl;

import com.example.admin.notes.base.BasePresenterImpl;
import com.example.admin.notes.presenter.MainPresenter;
import com.example.admin.notes.view.activity.MainView;

/**
 * Created by admin on 3/11/2018.
 */

public class MainPresenterImpl extends BasePresenterImpl<MainView> implements MainPresenter {
    public MainPresenterImpl(MainView view) {
        super(view);
    }
}

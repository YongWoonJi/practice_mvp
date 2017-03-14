package com.example.jyw.practice_mvp.vp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jyw.practice_mvp.R;
import com.google.common.base.Preconditions;


public class MainFragment extends Fragment implements IView {

    private MainPresenter presenter;
    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Preconditions.checkNotNull(inflater);
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        textView = (TextView) view.findViewById(R.id.textView_title);


        presenter = new MainPresenter();
        presenter.attachView(this);
        presenter.loadTask();





        return view;
    }

    @Override
    public void setTextTitle(String title) {
        textView.setText(title);
    }



}

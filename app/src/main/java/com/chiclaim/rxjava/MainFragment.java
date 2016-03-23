package com.chiclaim.rxjava;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chiclaim.rxjava.operator.create.CreateOperatorFragment;
import com.chiclaim.rxjava.operator.transform.FlatMapOperatorFragment;
import com.chiclaim.rxjava.operator.transform.MapOperatorFragment;

import java.util.Collections;
import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainFragment extends BaseFragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_create_just_from).setOnClickListener(this);
        view.findViewById(R.id.btn_map).setOnClickListener(this);
        view.findViewById(R.id.btn_flat_map).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_create_just_from:
                addFragment(new CreateOperatorFragment());
                break;
            case R.id.btn_map:
                addFragment(new MapOperatorFragment());
                break;
            case R.id.btn_flat_map:
                addFragment(new FlatMapOperatorFragment());
                break;
        }
    }

}

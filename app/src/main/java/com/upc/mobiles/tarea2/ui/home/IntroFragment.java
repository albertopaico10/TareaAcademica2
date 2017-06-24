package com.upc.mobiles.tarea2.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.upc.mobiles.tarea2.R;
import com.upc.mobiles.tarea2.common.BaseFragment;

/**
 * Created by apaico on 20/06/17.
 */
public class IntroFragment extends BaseFragment {

    public IntroFragment() {
    }

    public static IntroFragment newInstance() {
        Bundle args = new Bundle();
        IntroFragment fragment = new IntroFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected View onCreateViewCalled(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_intro, container, false);
    }
}

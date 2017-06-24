package com.upc.mobiles.tarea2.ui.about;

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
public class AboutMeFragment extends BaseFragment {

    public AboutMeFragment() {
    }

    public static AboutMeFragment newInstance() {
        Bundle args = new Bundle();
        AboutMeFragment fragment = new AboutMeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected View onCreateViewCalled(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sIsPublic=false;
        return inflater.inflate(R.layout.fragment_about_me, container, false);
    }

    @Override
    public String getTitle(){
        return getString(R.string.title_about_me);
    }

    @Override
    public boolean showBack(){
        return true;
    }

}

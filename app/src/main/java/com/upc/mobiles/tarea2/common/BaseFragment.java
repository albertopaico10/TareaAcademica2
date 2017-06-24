package com.upc.mobiles.tarea2.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by apaico on 19/06/17.
 */
public abstract class BaseFragment extends Fragment {
    protected InteractionListener mInteractionListener;
    protected static boolean sIsPublic =true;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InteractionListener) {
            mInteractionListener = (InteractionListener) context;
        } else {
            throw new RuntimeException("Context should implements InteractionListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = onCreateViewCalled(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        mInteractionListener.updateTitle(getTitle().toUpperCase(), showBack(), sIsPublic);
        return rootView;
    }

    public String getTitle() {
        return "";
    }
    public boolean showBack() {
        return false;
    }

    protected abstract View onCreateViewCalled(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    public interface InteractionListener {
        void replaceFragmentPrivate(Fragment fragment, boolean addToBackStack);
        void updateTitle(String title, boolean showBack,boolean isPublic);
    }

}

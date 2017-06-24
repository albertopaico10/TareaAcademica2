package com.upc.mobiles.tarea2.common;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.upc.mobiles.tarea2.R;

/**
 * Created by apaico on 19/06/17.
 */
public class FragmentManagerHelper {
    private FragmentManager mFragmentManager;

    public FragmentManagerHelper(FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;
    }

    public void replacePrivate(Fragment fragment, boolean addToBackStack) {
        replace(R.id.fl_content_private, fragment, addToBackStack);
    }

    public void replace(@IdRes int containerId, Fragment fragment, boolean addToBackStack) {
        FragmentTransaction replaceTransaction = mFragmentManager.beginTransaction();
        replaceTransaction.replace(containerId, fragment, fragment.getClass().getName());
        if (addToBackStack) {
            replaceTransaction.addToBackStack(fragment.getClass().getName());
        }
        replaceTransaction.commit();
    }
}

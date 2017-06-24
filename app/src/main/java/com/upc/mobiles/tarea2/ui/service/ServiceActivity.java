package com.upc.mobiles.tarea2.ui.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.upc.mobiles.tarea2.R;
import com.upc.mobiles.tarea2.common.BaseActivity;

/**
 * Created by apaico on 20/06/17.
 */
public class ServiceActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_private_main);
        if (savedInstanceState == null){
            replaceFragmentPrivate(ServiceFragment.newInstance(), false);
        }
    }

    public static Intent makeIntent(Context context){
        Intent intent = new Intent(context, ServiceActivity.class);
        return intent;
    }
}

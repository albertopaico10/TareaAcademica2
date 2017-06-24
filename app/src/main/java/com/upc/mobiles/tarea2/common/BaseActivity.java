package com.upc.mobiles.tarea2.common;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.upc.mobiles.tarea2.R;

import butterknife.ButterKnife;

/**
 * Created by apaico on 19/06/17.
 */
public class BaseActivity extends AppCompatActivity implements BaseFragment.InteractionListener{
    private FragmentManagerHelper mFragmentManagerHelper;
    protected Toolbar tbToolbar;
    protected Toolbar tbToolbarPrivate;
    protected ProgressBar pbProgress;
    protected ProgressBar pbProgressPrivate;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mFragmentManagerHelper = new FragmentManagerHelper(getSupportFragmentManager());
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        tbToolbarPrivate = ButterKnife.findById(this, R.id.tb_toolbar_private);
        pbProgressPrivate = ButterKnife.findById(this, R.id.pb_loading_private);
        if (tbToolbar != null) {
            setSupportActionBar(tbToolbar);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayShowTitleEnabled(false);
            }
        }
        if (tbToolbarPrivate != null) {
            setSupportActionBar(tbToolbarPrivate);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayShowTitleEnabled(false);
            }
        }
    }

    public void replaceFragmentPrivate(Fragment fragment, boolean addToBackStack) {
        mFragmentManagerHelper.replacePrivate(fragment, addToBackStack);
    }

    protected boolean willTheActivityHandleTheToolbar() {
        return false;
    }

    @Override
    public void updateTitle(String title, boolean showBack,boolean isPublic) {
        if (!willTheActivityHandleTheToolbar()) {
            updateToolbar(title, showBack,isPublic);
        }
    }

    protected void updateToolbar(String title, boolean showBack,boolean isPublic) {
        if (tbToolbarPrivate != null && getSupportActionBar() != null) {
            tbToolbarPrivate.setTitle("");
            TextView tvTitle = ButterKnife.findById(tbToolbarPrivate, R.id.tv_title_private);
            if (tvTitle != null) {
                tvTitle.setText(title);
            }
            if (showBack) {
                getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_black);
                tbToolbarPrivate.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                    }
                });
            }
            getSupportActionBar().setDisplayHomeAsUpEnabled(showBack);
        }
    }
}

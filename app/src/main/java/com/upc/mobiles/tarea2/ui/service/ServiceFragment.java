package com.upc.mobiles.tarea2.ui.service;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.upc.mobiles.tarea2.R;
import com.upc.mobiles.tarea2.adapters.ServiceFieldAdapter;
import com.upc.mobiles.tarea2.common.BaseFragment;
import com.upc.mobiles.tarea2.field.ServiceField;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by apaico on 20/06/17.
 */
public class ServiceFragment extends BaseFragment {

    @Bind(R.id.rw_service_list)RecyclerView rwServiceList;
    private ServiceFieldAdapter mServiceFieldAdapter;
    private List<ServiceField> mServiceList;
    private List<ServiceField> mFields = new ArrayList<>();

    public ServiceFragment() {
        mServiceList=new ArrayList<>();
    }

    private void setUI() {
        mServiceFieldAdapter = new ServiceFieldAdapter(mServiceList);
        rwServiceList.setLayoutManager(new LinearLayoutManager(getContext()));
        rwServiceList.setAdapter(mServiceFieldAdapter);
        preparedData();
    }

    private List<ServiceField> preparedData(){
        mFields.add(new ServiceField("Producto 1","Este es el detalle del producto #1, espero que este bien",R.drawable.cam1));
        mFields.add(new ServiceField("Producto 2","Este es el detalle del producto #2, espero que este bien",R.drawable.check_android));
        mFields.add(new ServiceField("Producto 3","Este es el detalle del producto #3, espero que este bien",R.drawable.red_reload2));
        mServiceFieldAdapter.update(mFields);
        return mFields;
    }

    public static ServiceFragment newInstance() {
        Bundle args = new Bundle();
        ServiceFragment fragment = new ServiceFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHasOptionsMenu(true);
        setUI();
    }

    @Override
    protected View onCreateViewCalled(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sIsPublic=false;
        return inflater.inflate(R.layout.fragment_service, container, false);
    }

    @Override
    public String getTitle(){
        return getString(R.string.title_service);
    }

    @Override
    public boolean showBack(){
        return true;
    }
}

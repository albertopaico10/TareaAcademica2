package com.upc.mobiles.tarea2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.upc.mobiles.tarea2.R;
import com.upc.mobiles.tarea2.field.ServiceField;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by apaico on 19/06/17
 */
public class ServiceFieldAdapter extends RecyclerView.Adapter<ServiceFieldAdapter.ServiceViewHolder>{
    private List<ServiceField> mServiceList;

    public ServiceFieldAdapter(List<ServiceField> serviceList) {
        this.mServiceList = serviceList;
    }

    @Override
    public ServiceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item_service_field, parent, false);
        return new ServiceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ServiceViewHolder holder, final int position) {
        ServiceField serviceField = mServiceList.get(position);
        holder.ibTitleService.setText(serviceField.getTitle());
        holder.ibSubTitleProduct.setText(serviceField.getDetail());
        holder.ibServicePhoto.setBackgroundResource(serviceField.getmImageView());
    }

    @Override
    public int getItemCount() {
        return mServiceList.size();
    }

    public class ServiceViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.service_photo)ImageView ibServicePhoto;
        @Bind(R.id.title_service)TextView ibTitleService;
        @Bind(R.id.sub_title_product)TextView ibSubTitleProduct;

        public ServiceViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void update(List<ServiceField> serviceField){
        if (serviceField!=null){
            mServiceList.clear();
            mServiceList.addAll(serviceField);
            notifyDataSetChanged();
        }
    }
}

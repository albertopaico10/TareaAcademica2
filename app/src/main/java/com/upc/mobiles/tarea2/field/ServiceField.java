package com.upc.mobiles.tarea2.field;

/**
 * Created by Alberto on 19/06/17.
 */

public class ServiceField {
    private String title;
    private String detail;
    private int mImageView;

    public ServiceField(String title, String detail, int mImageView) {
        this.title = title;
        this.detail = detail;
        this.mImageView = mImageView;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getmImageView() {
        return mImageView;
    }

    public void setmImageView(int mImageView) {
        this.mImageView = mImageView;
    }
}

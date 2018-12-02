package com.ehi.component.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.io.Serializable;

/**
 * 这个类表示一次路由的返回结果对象
 * time   : 2018/11/10
 *
 * @author : xiaojinzi 30212
 */
public class EHiRouterResult implements Serializable {

    /**
     * 表示这次路由是否成功路由过去了
     */
    private boolean isSuccess;

    /**
     * 如果成功了,这个会有值
     */
    @NonNull
    private EHiRouterRequest request;

    /**
     * 当发生错误的时候,这个对象就是发生错误的时候跑出来的异常
     * {@link #isSuccess} true 的时候这个字段为 null
     */
    @Nullable
    private Exception error;

    public EHiRouterResult() {
    }

    public EHiRouterResult(boolean isSuccess, @Nullable Exception error) {
        this.isSuccess = isSuccess;
        this.error = error;
    }

    public EHiRouterResult(boolean isSuccess, @Nullable EHiRouterRequest request, @Nullable Exception error) {
        this.isSuccess = isSuccess;
        this.request = request;
        this.error = error;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    @NonNull
    public EHiRouterRequest getRequest() {
        return request;
    }

    public void setRequest(@NonNull EHiRouterRequest request) {
        this.request = request;
    }

    @Nullable
    public Exception getError() {
        return error;
    }

    public void setError(@Nullable Exception error) {
        this.error = error;
    }

    public static final EHiRouterResult success(EHiRouterRequest request) {
        return new EHiRouterResult(true, request, null);
    }

    public static final EHiRouterResult error(@NonNull Exception e) {
        return new EHiRouterResult(false, e);
    }

}
package com.reactnativebridge;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class OpenActivityModule extends ReactContextBaseJavaModule {
    public OpenActivityModule(@Nullable ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return "OpenActivity";
    }
    @ReactMethod
    public void open(){
        Intent intent=new Intent(getCurrentActivity(),Activity.class);
        getCurrentActivity().startActivity(intent);
    }
}

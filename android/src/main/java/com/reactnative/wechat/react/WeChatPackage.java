package com.reactnative.wechat.react;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WeChatPackage implements ReactPackage {
    private static Bitmap bm = null;
    public WeChatPackage(){
        super();
    }
    public WeChatPackage(Bitmap bm){
        super();
        if(bm!=null){
            this.bm = bm;
        }
    }
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {

        return Arrays.asList(new NativeModule[]{
            // Modules from third-party
            new WeChatModule(reactContext,this.bm),
        });
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}

package com.reactnative.wechat.react;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WeChatPackage implements ReactPackage {
    private static String bm = null;//base64形式
    public WeChatPackage(){
        super();
    }
    public WeChatPackage(String bm){
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


package com.verifone.bbpos;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNReactVfCrsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactVfCrsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactVfCrs";
  }

  @ReactMethod
  public void resultMethod(Promise promise){
    System.out.println("result:"+promise);
    promise.resolve(result);
  }

  
}
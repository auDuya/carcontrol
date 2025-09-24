package com.carcontrol.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.carcontrol.app.entity.AppData;
import com.carcontrol.app.helper.MyBroadcastReceiver;
import com.carcontrol.app.helper.PublicTools;

public class UsbActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    SharedPreferences sharedPreferences = this.getSharedPreferences("setting", Context.MODE_PRIVATE);
    if (sharedPreferences.getBoolean("isActive", false)) {
      if (AppData.mainActivity == null) startActivity(new Intent(this, MainActivity.class));
      else {
        Intent intent = new Intent();
        intent.setAction(MyBroadcastReceiver.ACTION_UPDATE_USB);
        sendBroadcast(intent);
      }
    }
    finish();
  }
}

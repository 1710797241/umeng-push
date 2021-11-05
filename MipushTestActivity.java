package com.hjan.gridhelper;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.umeng.message.UmengNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

import static com.github.reactnativehero.umengpush.RNTUmengPushModule.handleMessage;
import static com.github.reactnativehero.umengpush.UmengPushActivity.mainActivityClass;


public class MipushTestActivity extends UmengNotifyClickActivity {

    private static String TAG = MipushTestActivity.class.getName();

    @Override

    protected void onCreate(Bundle bundle) {

        super.onCreate(bundle);

        setContentView(R.layout.launch_screen);

    }

    @Override

    public void onMessage(Intent intent) {

        super.onMessage(intent);  //此方法必须调用，否则无法统计打开数

        String body = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
        Log.i("umeng离线推送", body);
        handleMessage(this, mainActivityClass, intent);



    }

}

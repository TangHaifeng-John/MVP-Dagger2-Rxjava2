package com.zenglb.framework.status_callback;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.kingja.loadsir.callback.Callback;
import com.zenglb.framework.R;


/**
 * Description:TODO
 * Create Time:2017/9/2 16:17
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */

public class TimeoutCallback extends Callback {

    @Override
    protected int onCreateView() {
        return R.layout.layout_timeout;
    }

    @Override
    protected boolean onReloadEvent(Context context, View view) {
        Toast.makeText(context.getApplicationContext(),"Connecting to the network again!", Toast.LENGTH_SHORT).show();
        return false;
    }

}
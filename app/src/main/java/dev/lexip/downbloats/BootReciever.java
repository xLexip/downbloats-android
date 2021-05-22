package dev.lexip.downbloats;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReciever extends BroadcastReceiver {

    /**
     * Executes after boot
     */
    @Override
    public void onReceive(Context context, Intent arg1) {
        // Start Main Service
        Intent intent = new Intent(context,Service.class);
        context.startForegroundService(intent);
    }
}

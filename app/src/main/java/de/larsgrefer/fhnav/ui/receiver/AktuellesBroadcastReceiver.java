package de.larsgrefer.fhnav.ui.receiver;

import de.larsgrefer.fhnav.ui.service.AktuellesNotificationService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Receives a broadcast to check Aktuelles.
 * 
 */
public class AktuellesBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent notificationService = new Intent(context,
				AktuellesNotificationService.class);
		context.startService(notificationService);

	}
}
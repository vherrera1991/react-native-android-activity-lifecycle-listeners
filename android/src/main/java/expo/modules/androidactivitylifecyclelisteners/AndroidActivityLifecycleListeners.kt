package expo.modules.androidactivitylifecyclelisteners

import android.app.Activity
import android.content.Context
import android.os.Bundle
import expo.modules.core.interfaces.ReactActivityLifecycleListener

class AndroidActivityLifecycleListeners : ReactActivityLifecycleListener {
    override fun onCreate(activity: Activity, savedInstanceState: Bundle?) {
        val sharedPref = activity.application.applicationContext.getSharedPreferences(
                ACTIVITY_LIFECYCLE_LISTENERS_MODULE_SHARED_PREF, Context.MODE_PRIVATE);
        val editor = sharedPref.edit();

        val acceptIncomingCall = activity.intent.extras?.getBoolean(ACCEPT_CALL_INVITE)
        if (acceptIncomingCall != null) {
            editor.putBoolean(ACCEPT_INCOMING_CALL_INVITE_KEY, acceptIncomingCall)
            editor.apply();
        }
    }
}
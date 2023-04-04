package expo.modules.androidactivitylifecyclelisteners

import android.content.Context
import expo.modules.core.interfaces.Package
import expo.modules.core.interfaces.ReactActivityLifecycleListener

class AndroidActivityLifecycleListenersPackage : Package {
    override fun createReactActivityLifecycleListeners(activityContext: Context): List<ReactActivityLifecycleListener> {
        return listOf(AndroidActivityLifecycleListeners())
    }
}
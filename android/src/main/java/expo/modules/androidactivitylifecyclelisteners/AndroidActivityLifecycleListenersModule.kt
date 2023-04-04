package expo.modules.androidactivitylifecyclelisteners

import android.content.Context
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class AndroidActivityLifecycleListenersModule : Module() {
  override fun definition() = ModuleDefinition {
    // The module will be accessible from `requireNativeModule('AndroidActivityLifecycleListenersModule')` in JavaScript.
    Name("AndroidActivityLifecycleListenersModule")

    AsyncFunction("getInitialProps") {
      val sharedPref = context.getSharedPreferences(ACTIVITY_LIFECYCLE_LISTENERS_MODULE_SHARED_PREF, Context.MODE_PRIVATE)

      val acceptIncomingCall = sharedPref.getBoolean(ACCEPT_INCOMING_CALL_INVITE_KEY, false);

      val editor = sharedPref.edit();
      editor.clear()
      editor.apply()

      return@AsyncFunction mapOf(
              "acceptIncomingCall" to acceptIncomingCall
      );
    }
  }

  private val context
    get() = requireNotNull(appContext.reactContext)
}

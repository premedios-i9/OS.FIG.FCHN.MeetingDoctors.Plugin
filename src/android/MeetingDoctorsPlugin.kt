package com.fidelidade.meetingdoctors

import org.apache.cordova.CallbackContext
import org.apache.cordova.CordovaArgs
import org.apache.cordova.CordovaPlugin

class Plugin : CordovaPlugin() {
    override fun execute(
            action: String?,
            args: CordovaArgs?,
            callbackContext: CallbackContext?
    ): Boolean {
        if (action == "echo") {
            val message: String = args!!.getString(0)

            echo(message, callbackContext)
        }
        return super.execute(action, args, callbackContext)
    }

    private fun echo(message: String, callbackContext: CallbackContext?) {
        if (message.isNotEmpty()) {
            callbackContext?.success(message)
        } else {
            callbackContext?.error("Expected one non-empty string argument.")
        }
    }
}

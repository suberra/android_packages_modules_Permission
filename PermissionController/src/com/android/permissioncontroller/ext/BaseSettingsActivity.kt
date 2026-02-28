package com.android.permissioncontroller.ext

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

/**
 * Stub for GrapheneOS BaseSettingsActivity.
 * Provides base navigation for GmsCompat settings screens.
 */
abstract class BaseSettingsActivity : FragmentActivity() {
    abstract fun getNavGraphStart(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

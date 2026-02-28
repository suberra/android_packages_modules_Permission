package com.android.permissioncontroller.ext

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.preference.PreferenceCategory
import androidx.preference.PreferenceGroup

/**
 * Extension functions used by GmsCompat Permission settings.
 * Stubs for GrapheneOS utility extensions.
 */
fun PreferenceGroup.addCategory(titleResId: Int): PreferenceCategory {
    val cat = PreferenceCategory(context)
    cat.setTitle(titleResId)
    addPreference(cat)
    return cat
}

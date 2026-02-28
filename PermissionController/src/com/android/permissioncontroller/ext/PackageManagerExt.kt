import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager

/**
 * Top-level extension function for PackageManager.
 * Stub for GrapheneOS getAppInfoOrNull.
 */
fun PackageManager.getAppInfoOrNull(packageName: String): ApplicationInfo? {
    return try {
        getApplicationInfo(packageName, 0)
    } catch (e: PackageManager.NameNotFoundException) {
        null
    }
}

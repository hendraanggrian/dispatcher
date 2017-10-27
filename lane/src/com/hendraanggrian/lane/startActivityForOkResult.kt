@file:JvmMultifileClass
@file:JvmName("LanesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package com.hendraanggrian.lane

import android.app.Activity
import android.app.Fragment
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.support.annotation.RequiresApi

/**
 * Start an activity for result with random request code,
 * ignoring result that is not [Activity.RESULT_OK].
 *
 * @param intent The intent to start.
 * @param callback Activity result callback.
 *
 * @throws ActivityNotFoundException if no activity is found that can handle the [intent].
 *
 * @see Activity.startActivityForResult
 */
inline fun <T : Activity> T.startActivityForOkResult(
        intent: Intent,
        noinline callback: T.(data: Intent?) -> Unit
) = startActivityForResult(intent, { resultCode, data ->
    if (resultCode == Activity.RESULT_OK) callback(data)
})

/**
 * Start an activity for result with random request code,
 * ignoring result that is not [Activity.RESULT_OK].
 *
 * @param intent The intent to start.
 * @param options Additional options for how the activity should be started.
 * @param callback Activity result callback.
 *
 * @throws ActivityNotFoundException if no activity is found that can handle the [intent].
 *
 * @see Activity.startActivityForResult
 */
@RequiresApi(16)
inline fun <T : Activity> T.startActivityForOkResult(
        intent: Intent,
        options: Bundle,
        noinline callback: T.(data: Intent?) -> Unit
) = startActivityForResult(intent, options, { resultCode, data ->
    if (resultCode == Activity.RESULT_OK) callback(data)
})

/**
 * Start an activity for result with random request code,
 * ignoring result that is not [Activity.RESULT_OK].
 *
 * @param intent The intent to start.
 * @param callback Activity result callback.
 *
 * @throws ActivityNotFoundException if no activity is found that can handle the [intent].
 *
 * @see Fragment.startActivityForResult
 */
inline fun <T : Fragment> T.startActivityForOkResult(
        intent: Intent,
        noinline callback: T.(data: Intent?) -> Unit
) = startActivityForResult(intent, { resultCode, data ->
    if (resultCode == Activity.RESULT_OK) callback(data)
})

/**
 * Start an activity for result with random request code,
 * ignoring result that is not [Activity.RESULT_OK].
 *
 * @param intent The intent to start.
 * @param options Additional options for how the activity should be started.
 * @param callback Activity result callback.
 *
 * @throws ActivityNotFoundException if no activity is found that can handle the [intent].
 *
 * @see android.support.v4.app.Fragment.startActivityForResult
 */
@RequiresApi(16)
inline fun <T : Fragment> T.startActivityForOkResult(
        intent: Intent,
        options: Bundle,
        noinline callback: T.(data: Intent?) -> Unit
) = startActivityForResult(intent, options, { resultCode, data ->
    if (resultCode == Activity.RESULT_OK) callback(data)
})

/**
 * Start an activity for result with random request code,
 * ignoring result that is not [Activity.RESULT_OK].
 *
 * @param intent The intent to start.
 * @param callback Activity result callback.
 *
 * @throws ActivityNotFoundException if no activity is found that can handle the [intent].
 *
 * @see android.support.v4.app.Fragment.startActivityForResult
 */
inline fun <T : android.support.v4.app.Fragment> T.startActivityForOkResult(
        intent: Intent,
        noinline callback: T.(data: Intent?) -> Unit
) = startActivityForResult(intent, { resultCode, data ->
    if (resultCode == Activity.RESULT_OK) callback(data)
})

/**
 * Start an activity for result with random request code,
 * ignoring result that is not [Activity.RESULT_OK].
 *
 * @param intent The intent to start.
 * @param options Additional options for how the activity should be started.
 * @param callback Activity result callback.
 *
 * @throws ActivityNotFoundException if no activity is found that can handle the [intent].
 *
 * @see android.support.v4.app.Fragment.startActivityForResult
 */
@RequiresApi(16)
inline fun <T : android.support.v4.app.Fragment> T.startActivityForOkResult(
        intent: Intent,
        options: Bundle,
        noinline callback: T.(data: Intent?) -> Unit
) = startActivityForResult(intent, options, { resultCode, data ->
    if (resultCode == Activity.RESULT_OK) callback(data)
})
package com.loamen.preference.demo

import com.loamen.preference.PreferenceActivityBase
import com.loamen.preference.PreferenceFragmentBase


/**
 *
 */
class SettingsActivity : PreferenceActivityBase() {

    override fun onCreatePreferenceHeader(): PreferenceFragmentBase {
        return PreferenceFragmentRoot()
    }

}
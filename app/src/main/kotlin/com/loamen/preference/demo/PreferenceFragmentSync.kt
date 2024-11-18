package com.loamen.preference.demo

import android.os.Bundle
import com.loamen.preference.PreferenceFragmentBase
import com.loamen.preference.demo.R

class PreferenceFragmentSync : PreferenceFragmentBase() {

    override fun titleResourceId(): Int {
        return R.string.sync_header
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_sync, rootKey)
    }
}
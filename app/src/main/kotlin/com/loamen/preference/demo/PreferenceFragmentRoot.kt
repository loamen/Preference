package com.loamen.preference.demo

import android.os.Bundle
import com.loamen.preference.PreferenceFragmentBase
import com.loamen.preference.demo.R

class PreferenceFragmentRoot : PreferenceFragmentBase() {

    override fun titleResourceId(): Int {
        return R.string.title_activity_settings
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_root, rootKey)
    }
}
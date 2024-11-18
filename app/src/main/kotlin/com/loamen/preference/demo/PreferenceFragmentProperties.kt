package com.loamen.preference.demo

import android.os.Bundle
import com.loamen.preference.PreferenceFragmentBase
import com.loamen.preference.demo.R

class PreferenceFragmentProperties : PreferenceFragmentBase() {

    override fun titleResourceId(): Int {
        return R.string.pref_title_properties
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_properties, rootKey)
    }
}
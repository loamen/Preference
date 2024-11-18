package com.loamen.preference.demo

import android.os.Bundle
import com.loamen.preference.PreferenceFragmentBase
import com.loamen.preference.demo.R

class PreferenceFragmentMessages : PreferenceFragmentBase() {

    override fun titleResourceId(): Int {
        return R.string.messages_header
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_messages, rootKey)
    }
}
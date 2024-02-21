package com.example.mytodo

import android.icu.text.CaseMap.Title

data class Todo(
    val title: String,
    val body: String,
    val isChecked:Boolean
)

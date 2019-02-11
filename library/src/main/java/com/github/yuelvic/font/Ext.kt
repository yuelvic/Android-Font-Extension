package com.github.yuelvic.font

import android.graphics.Typeface
import android.util.Log
import android.util.TypedValue
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("type")
fun setType(view: TextView, type: String) {
    val fontStyle = FontExt.get()[type]
    if (fontStyle is FontStyle) {
        val typeface = Typeface.createFromAsset(view.context.assets, fontStyle.font)

        val style = when (fontStyle.style) {
            "bold" -> Typeface.BOLD
            "italic" -> Typeface.ITALIC
            else -> Typeface.NORMAL
        }

        view.setTypeface(typeface, style)
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontStyle.size.toFloat())
    }
}

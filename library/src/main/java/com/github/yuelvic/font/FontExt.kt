package com.github.yuelvic.font

import android.content.Context
import com.google.gson.Gson
import java.io.IOException
import java.nio.charset.Charset
import com.google.gson.reflect.TypeToken

object FontExt {

    private lateinit var fonts: Map<String, FontStyle>

    fun set(fonts: HashMap<String, FontStyle>) {
        this.fonts = fonts
    }

    fun set(data: String) {
        this.fonts = Gson().fromJson(
            data, object : TypeToken<HashMap<String, FontStyle>>() {}.type
        )
    }

    fun set(context: Context) {
        val json: String?
        try {
            val `is` = context.assets.open("fonts/fonts.json")
            val size = `is`.available()
            val buffer = ByteArray(size)
            `is`.read(buffer)
            `is`.close()
            json = String(buffer, Charset.forName("UTF-8"))
            set(json)
        } catch (ex: IOException) {
            ex.printStackTrace()
        }

    }

    fun get() = this.fonts

}
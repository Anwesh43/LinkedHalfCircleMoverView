package com.anwesh.uiprojects.linkedhalfcirclemoveview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.halfcirclemoveview.HalfCircleMoveView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HalfCircleMoveView.create(this)
    }
}

package net.davidcrotty.navigationaarc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Questions: How do we animate between fragments?
 *
 * Can we synthesize a navigation graph programmatically? ie: a flow changes
 *
 * Can we animate a view out of the screen?
 *
 * Can we instantiate fragment variants? ie, I want another fragment instead of the same instance?
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.example.turboandroidtutor

import android.view.View
import dev.hotwire.turbo.fragments.TurboWebFragment
import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "turbo://fragment/web")
class WebFragment : TurboWebFragment() {
    override fun createErrorView(statusCode: Int): View {
        return super.createErrorView(statusCode)
    }
}

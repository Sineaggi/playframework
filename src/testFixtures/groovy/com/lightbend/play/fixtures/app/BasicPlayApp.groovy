package com.lightbend.play.fixtures.app

import org.gradle.util.VersionNumber

class BasicPlayApp extends PlayApp {
    BasicPlayApp() {
        super()
    }

    BasicPlayApp(VersionNumber version) {
        super(version)
    }
}
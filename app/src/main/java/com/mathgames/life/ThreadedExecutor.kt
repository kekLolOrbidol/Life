package com.mathgames.life

import java.util.concurrent.Executor

class ThreadedExecutor : Executor {
    override fun execute(command: Runnable?) {
        Thread(command).start()
    }
}
import com.elbekD.bot.Bot
import com.elbekD.bot.types.BotCommand

/**
 * Created by artsultanmaga05@gmail.com on 31.08.2020.
 */
val admins = mapOf(
    "@artsultanmaga" to 227939305,
    "@BrightOS" to 426220634
)

val bot by lazy {
    Bot.createPolling("licey83_11b_bot", "1385573062:AAHnYF5vdxzpWLBZr5IrPuZXWtjzL094Zc0")
}

fun main() {
    bot.start()

    bot.setMyCommands(
        listOf(
            BotCommand("/start", "starts bot"),
            BotCommand("/stop", "stop bot")
        )
    )
    bot.onCommand("/start") { msg, _ ->
        println("user: ${msg.from} started the bot")
        bot.sendMessage(msg.chat.id, "Hello, ${msg.from?.first_name}")
    }
    bot.onCommand("/stop") { msg, _ ->
        println("user: ${msg.from} stopped the bot")
        bot.sendMessage(msg.chat.id, "Bot stopped")
    }
}
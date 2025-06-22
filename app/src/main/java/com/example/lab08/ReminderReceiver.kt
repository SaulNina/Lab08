package com.example.lab08

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.lab08.R

class ReminderReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val builder = NotificationCompat.Builder(context, "tasks_channel")
            .setSmallIcon(R.drawable.ic_launcher_foreground) // Usa uno válido
            .setContentTitle("Recordatorio de tarea")
            .setContentText("Tienes tareas pendientes.")
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        with(NotificationManagerCompat.from(context)) {
            notify(1001, builder.build())
        }
    }
}

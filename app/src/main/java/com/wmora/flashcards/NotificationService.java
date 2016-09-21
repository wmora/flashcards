package com.wmora.flashcards;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;

public class NotificationService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public NotificationService(String name) {
        super(name);
    }

    /**
     * Required empty constructor
     */
    public NotificationService() {
        this(NotificationService.class.getName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Flashcards.Flashcard flashcard = Flashcards.getRandom();

        if (flashcard == null) {
            return;
        }

        Notification.Builder builder = new Notification.Builder(this)
                .setContentTitle(flashcard.getPrompt())
                .setContentText(getString(R.string.notification_content_text))
                .setSmallIcon(R.mipmap.ic_launcher);

        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.notify(flashcard.hashCode(), builder.build());
    }

}

package com.wmora.flashcards;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

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

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentText(flashcard.getPrompt());

        NotificationManagerCompat.from(this).notify(0, builder.build());
    }

}

package com.wmora.flashcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Flashcards {

    public static final List<Flashcard> FLASHCARDS;

    static {
        FLASHCARDS = new ArrayList<>();
        FLASHCARDS.add(new Flashcard("What is bubble sort?"));
        FLASHCARDS.add(new Flashcard("What is the time complexity of bubble sort?"));
        FLASHCARDS.add(new Flashcard("What is the space complexity of bubble sort?"));
        FLASHCARDS.add(new Flashcard("What is selection sort?"));
        FLASHCARDS.add(new Flashcard("What is the time complexity of selection sort?"));
        FLASHCARDS.add(new Flashcard("What is the space complexity of selection sort?"));
        FLASHCARDS.add(new Flashcard("What is merge sort?"));
        FLASHCARDS.add(new Flashcard("What is the time complexity of merge sort?"));
        FLASHCARDS.add(new Flashcard("What is the space complexity of merge sort?"));
    }

    public static Flashcard getRandom() {
        Random random = new Random();
        int randomIndex = random.nextInt(Flashcards.FLASHCARDS.size());
        return FLASHCARDS.get(randomIndex);
    }

    public static class Flashcard {

        private String prompt;

        public Flashcard(String prompt) {
            this.prompt = prompt;
        }

        public String getPrompt() {
            return prompt;
        }
    }

}

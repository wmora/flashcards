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
        FLASHCARDS.add(new Flashcard("What is insertion sort?"));
        FLASHCARDS.add(new Flashcard("What is the time complexity of insertion sort?"));
        FLASHCARDS.add(new Flashcard("What is the space complexity of insertion sort?"));
        FLASHCARDS.add(new Flashcard("What is a red-black tree?"));
        FLASHCARDS.add(new Flashcard("What is a binary tree?"));
        FLASHCARDS.add(new Flashcard("What is a binary search tree?"));
        FLASHCARDS.add(new Flashcard("What is heap sort?"));
        FLASHCARDS.add(new Flashcard("What is the time complexity of heap sort?"));
        FLASHCARDS.add(new Flashcard("What is the space complexity of heap sort?"));
        FLASHCARDS.add(new Flashcard("What is quick sort?"));
        FLASHCARDS.add(new Flashcard("What is the time complexity of quick sort?"));
        FLASHCARDS.add(new Flashcard("What is the space complexity of quick sort?"));
        FLASHCARDS.add(new Flashcard("What is a full binary tree?"));
        FLASHCARDS.add(new Flashcard("What is a complete binary tree?"));
        FLASHCARDS.add(new Flashcard("What is a perfect binary tree?"));
        FLASHCARDS.add(new Flashcard("What is memoization?"));
        FLASHCARDS.add(new Flashcard("What is depth-first search?"));
        FLASHCARDS.add(new Flashcard("What is breadth-first search?"));
        FLASHCARDS.add(new Flashcard("What is binary search?"));
        FLASHCARDS.add(new Flashcard("What is a balanced tree?"));
        FLASHCARDS.add(new Flashcard("What are three binary tree traversals?"));
        FLASHCARDS.add(new Flashcard("What is in-order binary tree traversal?"));
        FLASHCARDS.add(new Flashcard("What is pre-order binary tree traversal?"));
        FLASHCARDS.add(new Flashcard("What is post-order binary tree traversal?"));
        FLASHCARDS.add(new Flashcard("What is a linked list?"));
        FLASHCARDS.add(new Flashcard("What is a trie?"));
        FLASHCARDS.add(new Flashcard("What is the heap?"));
        FLASHCARDS.add(new Flashcard("What is a hash table?"));
        FLASHCARDS.add(new Flashcard("What is dynamic programming?"));
        FLASHCARDS.add(new Flashcard("How is the stack different from the heap?"));
        FLASHCARDS.add(new Flashcard("What is a data structure?"));
        FLASHCARDS.add(new Flashcard("What is a greedy algorithm?"));
        FLASHCARDS.add(new Flashcard("What is a min-heap?"));
        FLASHCARDS.add(new Flashcard("What is a max-heap?"));
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

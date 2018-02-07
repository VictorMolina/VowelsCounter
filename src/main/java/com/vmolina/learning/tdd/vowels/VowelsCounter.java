package com.vmolina.learning.tdd.vowels;

public class VowelsCounter {

    private static final String REGEXP_VOWEL = "[a|e|i|o|u]";

    public static int execute(String input) {
        int vowels = 0;
        for (int pos = 0; pos < input.length(); pos++) {
            if (input.substring(pos, pos + 1).matches(REGEXP_VOWEL)) {
                vowels++;
            }
        }
        return vowels;
    }

}

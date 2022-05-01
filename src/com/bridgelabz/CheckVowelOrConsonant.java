package com.bridgelabz;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a character to check if its vowel or consonant: ");
        char characterValue = Utility.getUserCharacter();
        switch (characterValue){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(characterValue+" is a vowel.");
                break;
            default:
                System.out.println(characterValue+" is a consonant.");
        }
    }
}

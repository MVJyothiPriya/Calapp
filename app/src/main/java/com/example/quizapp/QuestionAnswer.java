package com.example.quizapp;

public class QuestionAnswer {

    public static String question[] ={
            "What is Android Studio?",
            "Which version control system is commonly integrated with Android Studio for managing source code?",
            "What is Gradle in the context of Android Studio?",
            "Which version of Android introduced the Material Design guidelines, which greatly influenced app design in Android Studio?"
    };

    public static String choices[][] = {
            {"An operating system for mobile devices",
                    "An integrated development environment (IDE) for Android app development" ,
                    "A game development platform",
                    "A social media app"},
            {"Git" ,
                    "Mercurial",
                    "Subversion",
                    "CVS"},
            {"A version control system" ,
                    "An emulator for running Android apps" ,
                    "A build system for Android projects",
                    "A visual design tool"},
            {"Android 2.0 (Eclair)",
                    "Android 4.0 (Ice Cream Sandwich)" ,
                    "Android 5.0 (Lollipop)" ,
                    "Android 7.0 (Nougat)"}
    };

    public static String correctAnswers[] = {
            "An integrated development environment (IDE) for Android app development",
            "Git",
            "A build system for Android projects",
            "Android 5.0 (Lollipop)"
    };

}
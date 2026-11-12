package com.pluralsight;

public final class NameFormatter {

    // It don't always need to have static in the constructor
    private NameFormatter() {
    }

    public static String firstName;
    public static String lastName;
    public static String middleInitial;
    public static String prefix;
    public static String suffix;

    public static String formatName(String firstName,
                                  String lastName,
                                  String middleInitial,
                                  String prefix,
                                  String suffix){

        if (firstName == null || firstName.isBlank()){
            System.err.println("You must enter your first name.");
        }

        if (lastName == null || lastName.isBlank()){
            System.err.println("You must enter your last name.");
        }

        StringBuilder fullName = new StringBuilder();

        if (prefix != null && !prefix.isBlank()){
            fullName.append(formatP)
        }
    }
}

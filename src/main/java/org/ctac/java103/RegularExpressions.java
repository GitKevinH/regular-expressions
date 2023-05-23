package org.ctac.java103;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {

        //Write a regular expression to match a valid email address.

        Pattern emailPattern = Pattern.compile("^.+@.+\\..+$");
        //Matcher emailMatcher = emailPattern.matcher("kevingmail.com"); // expected false: missing @
        Matcher emailMatcher = emailPattern.matcher("kevin@gmail.com"); // expected true
        boolean emailCheck = emailMatcher.matches();

        System.out.println("emailCheck: "+emailCheck); // tester

        //Write a regular expression to match a valid phone number in the format (123) 456-7890.

        Pattern phonePattern = Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}$");
        //Matcher phoneMatcher = phonePattern.matcher("(313 313-3131"); // expected false: missing parenthesis
        Matcher phoneMatcher = phonePattern.matcher("(313) 313-3131"); // expected true
        boolean phoneCheck = phoneMatcher.matches();

        System.out.println("phoneCheck: "+phoneCheck); // tester

        //Write a regular expression to match a valid date in the format MM/DD/YYYY.

        Pattern datePattern = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
        //Matcher dateMatcher = datePattern.matcher("01/01/2000"); // expected false: missing last zero
        Matcher dateMatcher = datePattern.matcher("01/01/2000"); // expected true
        boolean dateCheck = dateMatcher.matches();

        System.out.println("dateCheck: "+dateCheck); // tester

        //Write a regular expression to match a valid URL.

        Pattern urlPattern = Pattern.compile("^(https?|ftp)://[^\\s/$.?#].[^\\s]*$");
        //Matcher urlMatcher = urlPattern.matcher("https//www.google.com"); // expected false: missing colon
        Matcher urlMatcher = urlPattern.matcher("https://www.google.com"); // expected true
        boolean urlCheck = urlMatcher.matches();

        System.out.println("urlCheck: "+urlCheck); // tester

        //Write a regular expression to match a valid credit card number (16 digits, may be separated by dashes or spaces).

        Pattern creditCardPattern = Pattern.compile("^(\\d{4}[- ]){3}\\d{4}|\\d{16}$");
        //Matcher creditCardMatcher = creditCardPattern.matcher("1234/5678/9876/5432"); // expected false: using slashes instead of dashes
        Matcher creditCardMatcher = creditCardPattern.matcher("1234-5678-9876-5432"); // expected true
        boolean creditCardCheck = creditCardMatcher.matches();

        System.out.println("creditCardCheck: "+creditCardCheck); // tester


        //Write a regular expression to match a valid US zip code (5 digits, may have a dash followed by 4 more digits).

        Pattern zipcodePattern = Pattern.compile("^\\d{5}(-\\d{4})?$");
        //Matcher zipcodeMatcher = zipcodePattern.matcher("48312-23442"); // expected false: too many digits
        //Matcher zipcodeMatcher = zipcodePattern.matcher("48312"); // expected true: only 5 digits
        Matcher zipcodeMatcher = zipcodePattern.matcher("48312-2344"); // expected true: more digits
        boolean zipcodeCheck = zipcodeMatcher.matches();

        System.out.println("zipcodeCheck: "+zipcodeCheck); // tester

        //Write a regular expression to match a valid Java identifier (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit).

        Pattern javaIdPattern = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]{3,14}$");
        //Matcher javaIdMatcher = javaIdPattern.matcher("1TwoThree"); // expected false: starts with digit
        //Matcher javaIdMatcher = javaIdPattern.matcher("helloVar"); // expected true
        Matcher javaIdMatcher = javaIdPattern.matcher("$money"); // expected true
        boolean javaIdCheck = javaIdMatcher.matches();

        System.out.println("javaIdCheck: "+javaIdCheck); // tester

        //Write a regular expression to match a valid hexadecimal color code (starts with a # followed by 6 hexadecimal digits).

        Pattern hexaPattern = Pattern.compile("^#[0-9a-fA-F]{6}$");
        //Matcher hexaMatcher = hexaPattern.matcher("#FFFFFFZ"); // expected false: too many letters(z)
        Matcher hexaMatcher = hexaPattern.matcher("#FFFFFF"); // expected true
        boolean hexaCheck = hexaMatcher.matches();

        System.out.println("hexaCheck: "+hexaCheck); // tester

        //Write a regular expression to match a valid time in the 24-hour format (HH:MM).

        Pattern twentyfourPattern = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");
        //Matcher twentyfourMatcher = twentyfourPattern.matcher("26:44"); // expected false: over 24 hours
        Matcher twentyfourMatcher = twentyfourPattern.matcher("23:59"); // expected true
        boolean twentyfourCheck = twentyfourMatcher.matches();

        System.out.println("twentyfourCheck: "+twentyfourCheck); // tester


    }
    }



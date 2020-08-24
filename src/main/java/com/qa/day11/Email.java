package com.qa.day11;

public class Email {

    public boolean isValidEmail(String s) {
        if (s.contains("@")) {
            if (s.charAt(0) == '@' || s.charAt(0) == '_' || s.charAt(s.length() - 1) == ')') {
                return false;
            } else {
                String[] emailInTwoParts = s.split("@");
                String domainName = emailInTwoParts[1];
                if(domainName.contains(".") && domainName.length() < 13) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }

}



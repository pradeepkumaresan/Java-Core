package com.pradeep.general;

/**
 * There are two strings X and Y of equal length, made up of lower case letters and the character '?'.
 * The wildcard character '?' can be substituted by any single lower case English letter for matching.
 * You need to find if the strings X and Y can be matched by replacing '?' by any single lower case letter.
 * Output a single line with the word Yes if the strings can be matched, otherwise output No.
 * Assume the maximum length of strings X and Y to be 20.
 */
public class WildcardMatching {
    public static void main(String[] args) {
        /*String s1 = "s?or?";
        String s2 = "sco??";*/

        String s1 = "stor?";
        String s2 = "sco??";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        boolean flag = false;
        for (int i=0; i < s1.length() ; i++){
            if (c1[i] != '?' && c2[i] != '?' && c1[i] != c2[i]){
                flag = true;
            }
            /*if (c1[i] == '?' || c2[i] == '?'){
                continue;
            }*/
        }
        if(flag)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}

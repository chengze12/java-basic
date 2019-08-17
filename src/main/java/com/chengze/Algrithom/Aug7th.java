package com.chengze.Algrithom;
import org.checkerframework.checker.units.qual.A;

import java.util.*;
public class Aug7th {

    public static boolean findPermutation(String str, String pattern) {
        int windowStart = 0, matched = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char chr : pattern.toCharArray())
            charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0) + 1);

        // our goal is to match all the characters from the 'charFrequencyMap' with the current window
        // try to extend the range [windowStart, windowEnd]
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)) {
                // decrement the frequency of the matched character
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) == 0) // character is completely matched
                    matched++;
            }

            if (matched == charFrequencyMap.size()) {
                System.out.println(true);
                return true;
            }
            if (windowEnd >= pattern.length() - 1) { // shrink the window by one character
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0)
                        matched--; // before putting the character back, decrement the matched count
                    // put the character back for matching
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }
        System.out.println(false);
        return false;
    }

        public boolean find(String longword, String shortword){
            char[] chars= shortword.toCharArray();
            Arrays.sort(chars);
            String string= new String(chars);
            int n=shortword.length();
            boolean res= true;
            for(int i=0; i<= longword.length()-n; i++){
                String temp=longword.substring(i, i+n);
                char[] tempchars= temp.toCharArray();
                Arrays.sort(tempchars);
                String tempstring= new String(tempchars);
                if(tempstring.equals(string)){
                    System.out.println(res);
                    return res;
                }
            }
            res=false;
            System.out.println(res);
            return res;
        }

        public static void main(String[] args) {
            Aug7th solution= new Aug7th();
            String longword="aoidbcf";
            String shortword="abc";
            solution.findPermutation(longword, shortword);
        }
    }

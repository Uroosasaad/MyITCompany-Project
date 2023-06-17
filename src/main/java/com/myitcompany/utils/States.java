package com.myitcompany.utils;

import com.myitcompany.Exceptions.StateNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class States {
    static String myState = "Texas";


    private final static Map<String, String> stateAbbreviationDictionary = new HashMap<>();

    static {

        stateAbbreviationDictionary.put("AL", "Alabama");
        stateAbbreviationDictionary.put("AK", "Alaska");
        stateAbbreviationDictionary.put("AZ", "Arizona");
        stateAbbreviationDictionary.put("AR", "Arkansas");
        stateAbbreviationDictionary.put("CA", "California");
        stateAbbreviationDictionary.put("CO", "Colorado");
        stateAbbreviationDictionary.put("CT", "Connecticut");
        stateAbbreviationDictionary.put("DE", "Delaware");
        stateAbbreviationDictionary.put("DC", "District Of Columbia");
        stateAbbreviationDictionary.put("FL", "Florida");
        stateAbbreviationDictionary.put("GA", "Georgia");
        stateAbbreviationDictionary.put("HI", "Hawaii");
        stateAbbreviationDictionary.put("ID", "Idaho");
        stateAbbreviationDictionary.put("IL", "Illinois");
        stateAbbreviationDictionary.put("IN", "Indiana");
        stateAbbreviationDictionary.put("IA", "Iowa");
        stateAbbreviationDictionary.put("KS", "Kansas");
        stateAbbreviationDictionary.put("KY", "Kentucky");
        stateAbbreviationDictionary.put("LA", "Louisiana");
        stateAbbreviationDictionary.put("ME", "Maine");
        stateAbbreviationDictionary.put("MD", "Maryland");
        stateAbbreviationDictionary.put("MA", "Massachusetts");
        stateAbbreviationDictionary.put("MI", "Michigan");
        stateAbbreviationDictionary.put("MN", "Minnesota");
        stateAbbreviationDictionary.put("MS", "Mississippi");
        stateAbbreviationDictionary.put("MO", "Missouri");
        stateAbbreviationDictionary.put("MT", "Montana");
        stateAbbreviationDictionary.put("NE", "Nebraska");
        stateAbbreviationDictionary.put("NV", "Nevada");
        stateAbbreviationDictionary.put("NH", "New Hampshire");
        stateAbbreviationDictionary.put("NJ", "New Jersey");
        stateAbbreviationDictionary.put("NM", "New Mexico");
        stateAbbreviationDictionary.put("NY", "New York");
        stateAbbreviationDictionary.put("NC", "North Carolina");
        stateAbbreviationDictionary.put("ND", "North Dakota");
        stateAbbreviationDictionary.put("OH", "Ohio");
        stateAbbreviationDictionary.put("OK", "Oklahoma");
        stateAbbreviationDictionary.put("OR", "Oregon");
        stateAbbreviationDictionary.put("PA", "Pennsylvania");
        stateAbbreviationDictionary.put("RI", "Rhode Island");
        stateAbbreviationDictionary.put("SC", "South Carolina");
        stateAbbreviationDictionary.put("SD", "South Dakota");
        stateAbbreviationDictionary.put("TN", "Tennessee");
        stateAbbreviationDictionary.put("TX", "Texas");
        stateAbbreviationDictionary.put("UT", "Utah");
        stateAbbreviationDictionary.put("VT", "Vermont");
        stateAbbreviationDictionary.put("VA", "Virginia");
        stateAbbreviationDictionary.put("WA", "Washington");
        stateAbbreviationDictionary.put("WV", "West Virginia");
        stateAbbreviationDictionary.put("WI", "Wisconsin");
        stateAbbreviationDictionary.put("WY", "Wyoming");
        stateAbbreviationDictionary.put("AB", "Alberta");
        stateAbbreviationDictionary.put("BC", "British Columbia");
        stateAbbreviationDictionary.put("MB", "Manitoba");
        stateAbbreviationDictionary.put("NB", "New Brunswick");
        stateAbbreviationDictionary.put("NL", "Newfoundland and Labrador");
        stateAbbreviationDictionary.put("NS", "Nova Scotia");
        stateAbbreviationDictionary.put("NT", "Northwest Territories");
        stateAbbreviationDictionary.put("NU", "Nunavut");
        stateAbbreviationDictionary.put("ON", "Ontario");
        stateAbbreviationDictionary.put("PE", "Prince Edward Island");
        stateAbbreviationDictionary.put("QC", "Quebec");
        stateAbbreviationDictionary.put("SK", "Saskatchewan");
        stateAbbreviationDictionary.put("YT", "Yukon");
    }

    public static String getStateFullName(String shortState)throws StateNotFoundException {
        if(stateAbbreviationDictionary.containsKey(shortState)){
            return stateAbbreviationDictionary.get(shortState);
        }
        throw new StateNotFoundException();
    }

}
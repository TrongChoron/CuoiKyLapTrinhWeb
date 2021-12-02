/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myshop.utils;

import org.mindrot.jbcrypt.BCrypt;

public class Bcrypt {

    private final int logRounds;

    public Bcrypt(int logRounds) {
        this.logRounds = logRounds;
    }

    public  String hash(String password) {
        String value = BCrypt.hashpw(password, BCrypt.gensalt(logRounds));
        return value;
    }

    public boolean verifyAndUpdateHash(String password, String hash) {
        if (BCrypt.checkpw(password, hash)) {
            int rounds = getRounds(hash);
            if (rounds != logRounds) {
            }
            return true;
        }
        return false;
    }

    /*
     * Copy pasted from BCrypt internals 🙁. Ideally a method
     * to exports parts would be public. We only care about rounds
     * currently.
     */
    private int getRounds(String salt) {
        char minor = (char) 0;
        int off = 0;
        if (salt.charAt(0) != '$' || salt.charAt(1) != '2') {
            throw new IllegalArgumentException("Invalid sale version");
        }
        if (salt.charAt(2) == '$') {
            off = 3;
        } else {
            minor = salt.charAt(2);
            if (minor != 'a' || salt.charAt(3) != '$') {
                throw new IllegalArgumentException("Invalid salt revision");
            }
            off = 4;
        }
        // Extract number of rounds
        if (salt.charAt(off + 2) > '$') {
            throw new IllegalArgumentException("Missing salt rounds");
        }
        return Integer.parseInt(salt.substring(off, off + 2));
    }
}

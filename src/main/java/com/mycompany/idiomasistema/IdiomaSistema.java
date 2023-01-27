/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idiomasistema;

import java.util.Locale;

/**
 *
 * @author Rodrigues
 */
public class IdiomaSistema {

    public static void main(String[] args) {
       Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
        System.getProperties();
        System.out.println(System.getProperty("user.language"));
    }
}

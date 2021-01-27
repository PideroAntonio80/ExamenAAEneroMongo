package com.sanvalero.examen_aa_enero_mongo.util;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

/**
 * Creado por @ author: Pedro Orós
 * el 27/01/2021
 */

public class R {

    public static InputStream getImage(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("images" + File.separator + name);
    }

    public static InputStream getProperties(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration" + File.separator + name);
    }

    public static URL getUI(String name) {
        return Thread.currentThread().getContextClassLoader().getResource("ui" + File.separator + name);
    }
}

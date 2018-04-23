/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bake.time;

import com.google.gson.Gson;

/**
 *
 * @author bigdata
 */
public class EUtils {

    public static Gson GSON = new Gson();

    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }

}

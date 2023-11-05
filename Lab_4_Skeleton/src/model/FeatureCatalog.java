/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author anzal
 */
public class FeatureCatalog {
    
    private static final Set<String> featureNames = new HashSet<>();

    public static void addFeatureName(String name) {
        featureNames.add(name);
    }

    public static Set<String> getFeatureNames() {
        return new HashSet<>(featureNames); // Return a copy to prevent modification
    }
}

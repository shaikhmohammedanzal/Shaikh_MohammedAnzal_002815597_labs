/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon productImage;
    
    private ArrayList<Feature> features = new ArrayList<>();

    private static int count = 0;
    
    // Method to get the list of features
    public ArrayList<Feature> getFeatures() {
        return features;
    }
    
    // Method to add a new feature and return it
    public Feature addNewFeature() {
        Feature newFeature = new Feature(this);
        features.add(newFeature);
        return newFeature;
    }

    // Method to remove a feature at a given index
    public void removeFeature(int index) {
        if (index >= 0 && index < features.size()) {
            features.remove(index);
        }
    }
    
    public ImageIcon getProductImage() {
        return productImage;
    }

    public void setProductImage(ImageIcon productImage) {
        this.productImage = productImage;
    }
    
    public Product() {
        count++;
        id = count;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean hasFeatureWithName(String featureName) {
        for (Feature feature : features) {
            if (feature.getName().equals(featureName)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}

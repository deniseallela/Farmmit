package com.xyz.farmit;

public class Custom {
    int images;
    String names,desription;
    //generate constructor to initialize values

    public Custom(int images, String names, String desription) {
        this.images = images;
        this.names = names;
        this.desription = desription;
    }
    //generate a getter to fetch the values

    public int getImages() {
        return images;
    }

    public String getNames() {
        return names;
    }

    public String getDesription() {
        return desription;
    }
}

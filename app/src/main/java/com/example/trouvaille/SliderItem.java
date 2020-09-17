package com.example.trouvaille;

import java.io.Serializable;

public class SliderItem implements Serializable {

    private int image;

    public SliderItem(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}

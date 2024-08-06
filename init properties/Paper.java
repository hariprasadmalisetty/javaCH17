class Paper {
    double thickness;
    String size;
    String quality;
    String color;

    public void print() {
        System.out.println("Thickness: " + this.thickness + " mm");
        System.out.println("Size: " + this.size);
        System.out.println("Quality: " + this.quality);
        System.out.println("Color: " + this.color);
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }
}

class PaperRunner {
    public static void main(String[] args) {
        Paper paper1 = new Paper(0.1, "A4", "High", "White");
        paper1.print();

        Paper paper2 = new Paper(0.2, "A3", "Medium", "Yellow");
        paper2.print();
    }
}
public enum Size {
    SMALL("S", 5, 10),
    MEDIUM("M", 11, 21),
    LARGE("L", 17, 32),
    EXTRA_LARGE("XL", 23, 43);

    private String abbreviation;
    private int width;
    private int length;

    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return String.format("%s or %s size: width = %d, length = %d.",
                getAbbreviation(),
                super.toString(),
                getWidth(),
                getLength());
    }
}



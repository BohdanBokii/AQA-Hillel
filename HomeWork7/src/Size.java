public enum Size {

    SMALL("S", 5, 10), Medium("M", 11, 21)
    , LARGE("L", 17, 32), EXTRA_LARGE("XL", 23, 43);

    private String format;

    private int width;

    private int length;
    Size(String format, int width, int length) {
        this.format = format;
        this.width = width;
        this.length = length;
    }

    public String getFormat() {
        return format;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return getFormat() + " or " + super.toString() + " size: " + "width = "
                + getWidth() + ", length = " + getLength() + ".";
    }
}


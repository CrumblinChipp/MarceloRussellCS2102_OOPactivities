enum WritingStyle{
    FICTION,
    NONFICTION,
    POETRY,
    DRAMA
}

class Writer extends Artist {
    private WritingStyle style;
    public Writer(String name, String nationality, int age, String specialty, WritingStyle style) {
        super(name, nationality, age, specialty);
        this.style = style;
    }

    public WritingStyle getWritingStyle() {
        return style;
    }

    public void setWritingStyle(WritingStyle style) {
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Writer Info ==");
        super.displayInfo();
        System.out.println("WritingStyle: " + style);
    }
}
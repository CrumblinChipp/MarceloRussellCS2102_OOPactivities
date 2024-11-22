enum DanceStyle{
    BALLET,
    JAZZ,
    HIPHOP,
    CONTEMPORARY
}

class Dancer extends Artist {
    private DanceStyle style;
    public Dancer(String name, String nationality, int age, String specialty, DanceStyle style) {
        super(name, nationality, age, specialty);
        this.style = style;
    }

    public DanceStyle getDanceStyle() {
        return style;
    }

    public void setDanceStyle(DanceStyle style) {
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Dancer Info ==");
        super.displayInfo();
        System.out.println("DanceStyle: " + style);
    }
}
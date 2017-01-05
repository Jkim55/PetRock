public class PetRock {
    private String name;
    private Boolean happy = false;
    private String size;

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void plays() {
        happy = true;
    }

}


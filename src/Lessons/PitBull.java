package Lessons;

public class PitBull extends Dog {

    public PitBull() {
        species = "Pit-Bull";
    }

    public void main(String[] args) {
        PitBull tim = new PitBull();
        tim.setName("Tim");
        tim.setAge(2);
        tim.setColor("Grey");
    }
}

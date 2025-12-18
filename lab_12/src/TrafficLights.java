import java.lang.Thread;

public class TrafficLights {
    enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }

    static TrafficLight currentColor = TrafficLight.RED;

    static TrafficLight changeColors (TrafficLight color){
        switch (color){
            case RED:
                return TrafficLight.YELLOW;
            case YELLOW:
                return TrafficLight.GREEN;
            case GREEN:
                return TrafficLight.RED;
            default:
                return TrafficLight.RED;
        }
    }

    @Override
    public String toString() {
        return currentColor.toString();
    }

    public static void main(String[] args) {
        TrafficLights lights = new TrafficLights();

        while (true) {
            System.out.println(lights.toString());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            currentColor = changeColors(currentColor);
        }
    }


}

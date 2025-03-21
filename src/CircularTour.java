import java.util.*;

class PetrolPump {
    int petrol, distance;
    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        Queue<Integer> queue = new LinkedList<>();
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;
            queue.offer(i);

            while (surplus < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                surplus -= (pumps[removed].petrol - pumps[removed].distance);
                start = removed + 1;
            }
        }

        return (surplus >= 0) ? start : -1; // If total fuel is sufficient
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int startIndex = findStartingPoint(pumps);
        System.out.println("Starting point: " + (startIndex == -1 ? "No solution" : startIndex));
    }
}
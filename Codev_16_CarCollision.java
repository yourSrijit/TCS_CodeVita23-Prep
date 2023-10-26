import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Statement:
//        On a busy road, multiple cars are passing by. A simulation is run to see what happens if brakes fail for
//        all cars on the road. The only way for them to be safe is if they don't collide and pass by each other.
//        The goal is to identify whether any of the given cars would collide or pass by each other safely around
//        a Roundabout. Think of this as a reference point 0 (Origin with coordinates (0,0)), but instead of
//        going around it, cars pass through it.
//        Considering that each car is moving in a straight line towards the origin with individual uniform speed.
//        Cars will continue to travel in that same straight line even after crossing origin. Calculate the number
//        of collisions
//        that will happen in such a scenario.
//        Note: -Calculate collisions only at origin. Ignore the other collisions. Assume that each car continues
//        on its respective path even after the collision without change of direction or speed for an infinite
//        distance.
public class Codev_16_CarCollision {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<Double,Integer> map=new HashMap<>();
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int sp=sc.nextInt();
            double time = (Math.pow(x, 2) + Math.pow(y, 2)) / Math.pow(sp, 2);
            map.put(time, map.getOrDefault(time,0)+1);
        }
        int collision=0;
        for(Map.Entry<Double,Integer> e:map.entrySet()){
            int v=e.getValue();
            if(v>1){
                collision+= v*(v-1)/2;
            }
        }
        System.out.println(collision);

    }
}

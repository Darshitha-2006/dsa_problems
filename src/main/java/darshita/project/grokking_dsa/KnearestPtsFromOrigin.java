package darshita.project.grokking_dsa;
import java.util.ArrayList;
import java.util.*;
class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    int distFromOrigin(){
        return (x*x) + (y*y);
    }
}
public class KnearestPtsFromOrigin {
    public static List<Point> KnearestPts(Point[] pts, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<Point>((a,b)->b.distFromOrigin()-a.distFromOrigin());
        for(int i=0; i<pts.length; i++){
            if(i<k){
                pq.add(pts[i]);
                continue;
            }
            if(pq.peek().distFromOrigin()>pts[i].distFromOrigin()){
                pq.poll();
                pq.add(pts[i]);
            }
        }
        return new ArrayList<>(pq);


    }

    public static void main(String[] args) {
        Point[] pts = new Point[]{new Point(1, 2), new Point(1, 1), new Point(1, 3), new Point(3, 3)};
        List<Point> ans = KnearestPts(pts, 3);
        for(Point p : ans){
            System.out.println(p.x + " " + p.y);
        }
    }
}

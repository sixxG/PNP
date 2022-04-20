package Point_Class;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        int res = o1.GetX().compareTo(o2.GetX());
        if (res != 0) return res;
        return o1.GetY().compareTo(o2.GetY());
    }
}

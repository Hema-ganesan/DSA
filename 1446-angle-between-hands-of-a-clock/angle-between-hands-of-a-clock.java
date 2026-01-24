class Solution {
    public double angleClock(int hour, int minutes) {
        double hrangle=(hour * 30)+(minutes * 0.5);
        double minangle=(minutes*6);
        double ang=Math.abs(hrangle-minangle);
        ang=Math.min(ang,360-ang);
         return ang;
    }
}

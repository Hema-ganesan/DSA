class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long newmass=mass;
        for(int i=0;i<asteroids.length;i++){
            if(newmass<asteroids[i]){
                return false;
            }
            newmass+=asteroids[i];
        }
        return true;
    }
}
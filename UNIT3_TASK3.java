import java.util.*;

class UndergroundSystem {
    private Map<Integer, Pair> checkIns;
    private Map<String, double[]> travelData;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travelData = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new Pair(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Pair checkInInfo = checkIns.get(id);
        checkIns.remove(id);

        String route = checkInInfo.station + "->" + stationName;
        int travelTime = t - checkInInfo.time;

        travelData.putIfAbsent(route, new double[2]);
        travelData.get(route)[0] += travelTime; 
        travelData.get(route)[1] += 1;         
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;
        double[] data = travelData.get(route);
        return data[0] / data[1];
    }
    private static class Pair {
        String station;
        int time;
        Pair(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }
}


// OUTPUT

//Input
//["UndergroundSystem","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime"]
//[[],[10,"Leyton",3],[10,"Paradise",8],["Leyton","Paradise"],[5,"Leyton",10],[5,"Paradise",16],["Leyton","Paradise"],[2,"Leyton",21],[2,"Paradise",30],["Leyton","Paradise"]]

//Output
//[null,null,null,5.00000,null,null,5.50000,null,null,6.66667]

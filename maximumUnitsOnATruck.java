//You are assigned to put some amount of boxes onto one truck. You are given a 2D array
//boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:numberOfBoxesi 
//is the number of boxes of type i.numberOfUnitsPerBoxi is the number of units in 
//each box of the type i. You are also given an integer truckSize, which is the 
//maximum number of boxes that can be put on the truck. You can choose any boxes to
//put on the truck as long as the number of boxes does not exceed truckSize.
//Return the maximum total number of units that can be put on the truck.


class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int totalUnits = 0;

        for(int[] boxType : boxTypes) {
            int boxes = boxType[0];
            int units = boxType[1];
            
            if(boxes < truckSize) {
                totalUnits += boxes * units;
                truckSize -= boxes;
            }
            else {
                totalUnits += truckSize * units;
                break;
            }
        }

        return totalUnits;
    }
}
package Lessons;

public class Marathon {

    public static int winner(int[] raceTimes){

        int winnerIndex = 0;  // The first place winner
        int winnerTime = raceTimes[0];   // set winner time to value of 0 index
        int count = 0;     // iterator, used to track winning index

        for(int elements: raceTimes){
            if(elements < winnerTime){
                winnerTime = elements;
                winnerIndex = count;
            }
            count++;
        }
        return winnerIndex;
    }

    public static int secondPlace(int[] raceTimes){

        int winnerIndex = winner(raceTimes);       // The index of the lowest item
        int secondIndex = 0;                           // The index of the second place item
        int count = 0;                             // iterator to keep track of index
        int secondPlace = 0;                       // Second lowest time

        if(winnerIndex == 0){
            secondIndex = 1;                           // The index of the second place item
        }

        for(int elements: raceTimes){
            if(elements == raceTimes[winnerIndex]){
                count++;
                continue;
            } else if(secondPlace == 0 || elements < secondPlace) {
                secondIndex = count;
                secondPlace = elements;
            }
            count++;
        }
        return secondIndex;
    }
}

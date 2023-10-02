public class Successors {

    public static Position findPosition(int value, int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == value) {
                    return new Position(row, col);
                }
            }
        }
        return null;
    }


    public static Position[][] getSuccessorArray(int[][] arr) {
        Position[][] successorArray = new Position[arr.length][arr[0].length];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int successorValue = arr[row][col] + 1;
                Position successorPosition = findPosition(successorValue, arr);
                successorArray[row][col] = successorPosition;
            }
        }

        return successorArray;
    }

}



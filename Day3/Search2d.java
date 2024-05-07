package Day3;

public class Search2d {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = matrix[mid / n][mid % n]; // Converting 1D index to 2D index

            if (midElement == target)
                return true;
            else if (midElement < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        if(searchMatrix(matrix,target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}

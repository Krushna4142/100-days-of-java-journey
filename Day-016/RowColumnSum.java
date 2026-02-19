public class RowColumnSum {

  public static void main(String[] args) {

    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 }
    };

    // Row Sum
    for (int i = 0; i < matrix.length; i++) {

      int rowSum = 0;

      for (int j = 0; j < matrix[i].length; j++) {
        rowSum += matrix[i][j];
      }

      System.out.println("Row " + i + " Sum = " + rowSum);
    }

    // Column Sum
    for (int j = 0; j < matrix[0].length; j++) {

      int colSum = 0;

      for (int i = 0; i < matrix.length; i++) {
        colSum += matrix[i][j];
      }

      System.out.println("Column " + j + " Sum = " + colSum);
    }
  }
}
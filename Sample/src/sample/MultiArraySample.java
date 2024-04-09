package sample;

public class MultiArraySample {
    
    public static void main(String[] args) {
        var matrix = new int[3][4];
        
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * 3 + j + 1;
            }
        }
        
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
                System.out.println();
               
            }
        }
    

}

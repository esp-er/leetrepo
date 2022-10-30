object leetcode48{
  class Solution{
    fun rotate(matrix: Array<IntArray>): Unit {
        var n = matrix.size - 1 // actually not n but n minus one
        var numIterations = matrix.size / 2 -1
        var rightBound = n

        (0..numIterations).forEach{ i ->
            (i until rightBound ).forEach{ j ->

                var tmp = matrix[i][j]
                matrix[i][j] = matrix[n-j][i]
                matrix[n-j][i] = matrix[n-i][n-j]
                matrix[n-i][n-j] = matrix[j][n - i]
                matrix[j][n-i] = tmp

            }
            rightBound--
        }
    }
  }
}

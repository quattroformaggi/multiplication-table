public class MultiplicationTable {
    /** @author quattroformaggi 
	 *  Print out a basic multiplication table 1-25
     * */
    public static void main(String[] args) {
        final int BORDERS = 26;                                 //X+1 to the actual size, because the table starts from 1.
        int[][] table = new int[BORDERS][BORDERS];              //two-dimensional array 16x16
        
        for(short i = 1; i < BORDERS; i++)
            for(short j = 1; j < BORDERS; j++)
                {
                    table[i][j] = j*i;                          //filling up
                    if(j % (BORDERS-1) == 0)                    //if the row index got to the border
                        System.out.print(table[i][j] + "\n");   //move to the next line
                    else                                        //otherwise
                        System.out.print(table[i][j] + "\t");   //split the numbers using the <TAB>
                };
    }
}
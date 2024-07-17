/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        while(true) {
            int row = (rand7()-1)*7;
            int col = rand7();
            int total = row+col;
            if(total <= 40) {
                return 1+(total-1)%10;
            }
        } 
    }
}
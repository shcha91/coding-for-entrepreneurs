public class Diamond {
    int [][] sum = new int[5][5];
    int [] median = new int[5];

    public void sum(){
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                int temp = i + j;
                sum[i][j] = temp;
            }
        }
    }

    public void transform(){
        for (int i=0; i<5; i++){
            median[i] = (sum[i][0] + sum[i][4]) / 2;
             for (int j=0; j<5; j++){
                if ((median[i]-(2-Math.abs(2-i)) <= sum[i][j]) && (sum[i][j] <= median[i]+(2-Math.abs(2-i)))) {
                    sum[i][j] = 1;
                } else {
                    sum[i][j] = 0;
                }
            }
        }
    }

    public void showDiamond(){
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

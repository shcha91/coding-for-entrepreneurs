import java.util.HashSet;

public class Lotto {
    public void lottery() {
        HashSet<Integer> lotto = new HashSet<>();
        while (lotto.size()<5) {
            int num = (int)(Math.random()*((24)+1))+1;
            lotto.add(num);
        }
        Integer[] lotto_array = new Integer[lotto.size()];
        lotto_array = lotto.toArray(new Integer[0]);

        for (int i=0; i<5; i++){
            System.out.print(lotto_array[i] +" ");
        }
}
}

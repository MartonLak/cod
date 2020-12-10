package ro.training.java.c07;

import java.util.*;

public class PickingNumbersNew {


    public static int pickingNumbers(List<Integer> a) {

        int max=0;

        max = Collections.max(a);
        //System.out.println("Numarul MAXIM= "+max);
        int collect[] = new int[max+1];
        int frequency[] = new int[max+2];
        int result = 0;
        for (int i = 0; i < a.size(); i++) {
            int index=a.get(i);
            frequency[index]=frequency[index]+1;
            //System.out.println(a.get(i) +" Se afla de " + frequency[index]+" ori");
        }
        for (int i = 1; i < max+1; i++)
        {
            result =  frequency[i-1] + frequency[i];
            collect[i]=result;
           // System.out.println(collect[i]);
        }
        int temp=0;
        for(int i=0; i < max+1; i++){
            for(int j=1; j < (max+1-i); j++){
                if(collect[j-1] > collect[j]){
                    temp = collect[j-1];
                    collect[j-1] = collect[j];
                    collect[j] = temp;
                }
            }
        }
        return collect[max];

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(4);
        myNumbers.add(2);
        System.out.println("rezultatul final= "+pickingNumbers(myNumbers));

    }
}

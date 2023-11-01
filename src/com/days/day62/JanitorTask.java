package com.days.day62;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JanitorTask {

    public static void main(String[] args) {

//        efficientJanitor(Arrays.asList(1.1f,1.5f,2f,3f,1.2f,1.9f,2.9f));
//        efficientJanitor(Arrays.asList(1.1f,1.1f,1.1f,1.5f,1.2f,1.3f,1.2f,1.9f));
        efficientJanitor(Arrays.asList(1.1f,1.5f,1.2f));
        efficientJanitor(Arrays.asList(2f,3f,3f,1.6f,1.7f,2f,2f,1.7f,1.9f,3f,2.5f,2.3f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f,2f));
    }

    public static int efficientJanitor(List<Float> weights){


        if(Collections.min(weights) > 1.5 ){
            return weights.size();
        } else if (weights.size() == 1){ // as approach sample!! to improve the performance of the solution
            return  1;
        }


        Collections.sort(weights);
        System.out.println("weights = " + weights);

        int left = 0;
        int right = weights.size()-1;

        int trip=0;

        while(left <= right){
            if(weights.get(left) + weights.get(right)<=3){
                // it means I can carry both together!!
                left++;
            }
            right--;
            trip++;
        }

        System.out.println("trip = " + trip);

        return trip;

    }
}

package com.company;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class intStream {
    private final ArrayList<Integer> array;
    private final int k;

    public intStream(ArrayList<Integer> array, int k) {
        this.array = array;
        this.k = k;
    }

    public Integer getRandomDelit(int x){
        ArrayList<Integer> arr = new ArrayList<>();
        iterInteger a = new iterInteger(x);
        while(a.iterator().hasNext()){
            if(x%a.getX()==0){
                arr.add(a.getX());
            }
            a.iterator().next();
        }
        /*for (int i = 1; i <= x ; i++){
            if (x % i == 0){
                arr.add(i);
            }
        }*/
        return arr.get((int) (Math.random() * arr.size()));
    }

    public Stream<Integer> stream(){
        ArrayList<Integer> result = new ArrayList<>();
        array.forEach(x -> result.add((int) Math.pow(getRandomDelit(x), k)));
        return result.stream();
    }

    public Optional<Integer> optional(){
        Optional<Integer> res = Optional.empty();
        Optional<Integer> min = array.stream().sorted().min(Integer::compare);
        if(min.isPresent()){
            res = Optional.of(min.get());
        }
        return res;
    }

    public String toString() {
        return "intStream{" + "array=" + array + '}';
    }
}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diseno Xtrmo
 */
public class Statistics {

    private ArrayList<Integer> ints;
    private ArrayList<Integer> aprb;
    private double sum;
    private double apr;

    public Statistics() {
        this.ints = new ArrayList<>();
        this.aprb = new ArrayList<>();
        this.sum = 0;
        this.apr = 0;
    }

    public void add(int value) {
        this.sum += value;
        this.ints.add(value);
        if (value >= 50) {
            this.aprb.add(value);
            this.apr += value;
        }
    }

    public double average() {
        return this.sum / ints.size();
    }

    public double averagePassing() {
        return this.apr / this.aprb.size();
    }

    public double percentagePass() {
        return (double) 100 * this.aprb.size() / ints.size() * 1.0;
    }

    public String table() {
        int cero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        String space = "";

        for (int i = 0; i < this.ints.size(); i++) {
            if (this.ints.get(i) < 50) {
                cero = cero + 1;
            }
            if (this.ints.get(i) > 49 && this.ints.get(i) < 60) {
                one++;
            }
            if (this.ints.get(i) > 59 && this.ints.get(i) < 70) {
                two++;
            }
            if (this.ints.get(i) > 69 && this.ints.get(i) < 80) {
                three++;
            }
            if (this.ints.get(i) > 79 && this.ints.get(i) < 90) {
                four++;
            }
            if (this.ints.get(i) >= 90) {
                five++;
            }

        }
        int[] grades = {cero, one, two, three, four, five};

        for (int i = 0; i < grades.length; i++) {
            space = space + i + ": ";
            for (int j = 0; j < grades[i]; j++) {

                space += "*";
            }
            space += "\n";
        }
        return space;
    }

    @Override
    public String toString() {
        if (this.aprb.isEmpty()) {
            return "Point average (all): " + average() + "\nPoint average (passing):-\nPass percentage: " + percentagePass() + "\nGrade distribution:\n" + table();
        }
        return "Point average (all): " + average() + "\nPoint average (passing): " + averagePassing() + "\nPass percentage: " + percentagePass() + "\nGrade distribution:\n" + table();
    }

}

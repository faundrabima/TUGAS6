import java.util.ArrayList;
//Abstract
public abstract class Main {
    priv    ate ArrayList <Integer> number = new ArrayList <Integer>();
    
//Setter misalnya dibawah ini adalah setNumber
    public void setNumber(int inputNum ) {
        this.number.add(inputNum);
    }
//Getter contohnya dibawah ini getNumber
    public ArrayList<Integer> getNumber() {
        return number;
    }
}
// SUB-CLASS 
class BasicCalculator extends Main {
    public int add() {
        int nilai, count;
        nilai = 0;
        for (count = 0;count < getNumber().size();count+=1 ) {
            nilai = nilai + getNumber().get(count);
        }
        return nilai;
    }

    public int substract() {
        int nilai, count;
        nilai = (getNumber().get(0)) * 2;
        // contoh pemanggilan method getter 
        for (count = 0;count < getNumber().size();count+=1 ) { 
            nilai = nilai - getNumber().get(count); //sepertinya polymorphism 
        }
        return nilai;
    }

    public int multiply() {
        int nilai, count;
        nilai = 1;
        for (count = 0;count < getNumber().size();count+=1 ) {
            nilai = nilai * getNumber().get(count);
        }
        return nilai;
    }

    public int divide() {
        int nilai, count;
        nilai = getNumber().get(0) * getNumber().get(0);
        for (count = 0;count < getNumber().size();count+=1 ) {
            nilai = nilai / getNumber().get(count);
        }
        return nilai;
    }
}

//SUB-CLASS
class ScientificCalculator extends Main {
    public double squareroot() {
        double hasil = Math.sqrt(getNumber().get(0));
        return hasil;
    }

    public int exponentiation() {
        int nilai, count;
        nilai = 1;
        for (count = 0;count < getNumber().get(1);count+=1) {
            nilai = nilai * getNumber().get(0);
        }
        return nilai;
    }

    public int factorial() {
        int nilai;
        nilai = recursive(getNumber().get(0));
        return nilai;
    }

    public int recursive(int inputNumber) {
        if (inputNumber == 1) {
            return 1;
        } else {
            inputNumber = inputNumber * recursive(inputNumber-1);
            return inputNumber;
        }
    }

}

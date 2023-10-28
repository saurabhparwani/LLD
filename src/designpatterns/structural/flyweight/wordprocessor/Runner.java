package designpatterns.structural.flyweight.wordprocessor;

public class Runner {
    public static void main(String args[]){

        ILetter object1 = LetterFactor.crateLetter('t');
        object1.display(0,0);

        ILetter object2 = LetterFactor.crateLetter('t');
        object1.display(0,6);

    }

}

import java.util.ArrayList;

public class Stos {
    private ArrayList<Integer> elementy = new java.util.ArrayList<>();
    private int pojemnosc;

    public int push(){
        if(pojemnosc < elementy.size()){
            elementy.addFirst(pojemnosc);
        }
            return 0;
    }
    public int pop(){
        if (!elementy.isEmpty()){
            return elementy.removeLast();
        }else {
            return 0;
        }
    }

    public void is_empty(){
        if (elementy.isEmpty()){
            System.out.println("Jest Pusty");
        }
    }

    public int top(){
        if(!elementy.isEmpty()){
            return elementy.getLast();
        }else {
            return 0;
        }
    }

}

public class Arithmetic {
    private int first = 0;
    private int second = 0;


    public  Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int sum(){
        return first + second;
    }
    public int multiplication(){
        return first * second;
    }
    public int max() {
        return (first > second ? first : second);
    }
    public int min() {
        return (first < second ? first : second);
    }
}

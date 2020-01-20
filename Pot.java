import java.util.List;

public class Pot {
    List<Egg> _eggs;
    String cooked;

    public Pot(List<Egg> eggs){
        _eggs = eggs;
    }

    public void cook(){
        cooked = "Surovi";
    }

    public String check(){
        cooked = "Gotovi";
        return cooked;
    }
}

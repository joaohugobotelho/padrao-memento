package memento;
import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<TextoMemento> mementos = new ArrayList<>();

    public void adicionarMemento(TextoMemento memento){
        mementos.add(memento);
    }

    public TextoMemento getMemento(int index){
        return mementos.get(index);
    }
}

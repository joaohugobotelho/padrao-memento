package memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EditorTextoTest {

    @Test
    public void deveSalvarERestaurarEstado() {

        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.setTexto("Primeira versão");
        historico.adicionarMemento(editor.salvar());

        editor.setTexto("Segunda versão");

        // Restaurando estado anterior
        editor.restaurar(historico.getMemento(0));

        assertEquals("Primeira versão", editor.getTexto());
    }

    @Test
    public void deveSalvarMultiplasVersoes() {

        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.setTexto("Versão 1");
        historico.adicionarMemento(editor.salvar());

        editor.setTexto("Versão 2");
        historico.adicionarMemento(editor.salvar());

        editor.setTexto("Versão 3");

        editor.restaurar(historico.getMemento(1));

        assertEquals("Versão 2", editor.getTexto());
    }
}

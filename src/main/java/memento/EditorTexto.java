package memento;

public class EditorTexto {
    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }


    //salva estado
    public TextoMemento salvar(){
        return new TextoMemento(texto);
    }

    // restaura estado
    public void restaurar(TextoMemento memento){
        this.texto = memento.getEstado();
    }
}

import java.util.NoSuchElementException;

public class Fila<E> {

	private Celula<E> inicio;
	private Celula<E> fim;
    private int tamanho;

    //construtor padrão
	public Fila() {

		inicio = null;
        fim = null;
        tamanho=0;

	}
    //verifica se está vazia
	public boolean vazia() {
		return inicio.proximo == null;
	}

    //construtor que recebe um parametro, considera vazia
	public Fila(E item) {
		
		inicio = new Celula<E>(item);
		inicio.proximo = new Celula<E>(item);
		fim = new Celula<E>(item);
		fim.proximo = null;
	}

	//inseriu uma 
	public void inserir(E item){

		//Transforma o objeto generico em uma celula
		 Celula<E> F = new Celula<>(item);
			//se esta vazia
			if (vazia()){
				//construtor inicial
				Fila<E> fila = new Fila<>();
			}else {
				
				fim.proximo = new Celula<E>(item);
				fim = new Celula<E>(item);
				fim.proximo = null;

			}
			
		

	}
	public E desempilhar() {

		E desempilhado = consultarTopo();
		topo = topo.getProximo();
		return desempilhado;

	}

	public E consultarTopo() {

		if (vazia()) {
			throw new NoSuchElementException("Nao há nenhum item na pilha!");
		}

		return topo.getItem();

	}

	/**
	 * Cria e devolve uma nova pilha contendo os primeiros numItens elementos
	 * do topo da pilha atual.
	 * 
	 * Os elementos são mantidos na mesma ordem em que estavam na pilha original.
	 * Caso a pilha atual possua menos elementos do que o valor especificado,
	 * uma exceção será lançada.
	 *
	 * @param numItens o número de itens a serem copiados da pilha original.
	 * @return uma nova instância de Pilha<E> contendo os numItens primeiros elementos.
	 * @throws IllegalArgumentException se a pilha não contém numItens elementos.
	 */
	public Pilha<E> subPilha(int numItens) {
		
		// TODO
		return null;
	}
}
package videogama;

/**
 *
 * @Kaua C Dias
 */
public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println(" --- Vamos começar XADREZ --- ");
        System.out.println(" --- Mova a primeira peça ---");
    }

    @Override
    public void fechar() {
        System.out.println(" --- Cheque Mate ---" );
    }
    
}

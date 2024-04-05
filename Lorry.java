
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPallets,int trailers,String licensePlate){
        super(licensePlate);
        this.numberOfPallets=numberOfPallets;   
        this.trailers=trailers;
    }
    
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    
    public int getTrailers(){
        return trailers;
    }
    public void setTrailers(int trailers){
        this.trailers = trailers;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("\n%15s: %d\n", "Numero de Paletas", this.numberOfPallets));  
        sb.append(String.format("%15s: %d\n", "Trailers", this.trailers));     
        return sb.toString();
    }
}

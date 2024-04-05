
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
   
    private int packages;
    
    public Van(int packages,String licensePlate){
        super(licensePlate);
        this.packages=packages;
    }
        
    public int getPackages(){
        return packages;
    }
    public void setPackages(int packages){
        this.packages = packages;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("\n%15s: %d\n", "Numero de Paletas", this.packages));    
        return sb.toString();
    }
}

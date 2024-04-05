
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    
    public GroundTransportation(String licensePlate ){
        this.licensePlate=licensePlate;
        super.setFees(0.03);
    }
    
    
}

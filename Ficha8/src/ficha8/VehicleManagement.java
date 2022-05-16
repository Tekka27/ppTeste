package ficha8;

/**
 *
 * @author Diogo
 */
public class VehicleManagement {

    private Veiculo[] listVeiculos;

    //Array adicionar remover
    public VehicleManagement() {
        this.listVeiculos = new Veiculo[0];

    }

    public boolean addVeiculo(Veiculo veiculo) {

        if (isExist(veiculo)) {
            return false;
        }

        Veiculo[] temp = new Veiculo[this.listVeiculos.length + 1];

        for (int i = 0; i < this.listVeiculos.length; i++) {

            temp[i] = this.listVeiculos[i];
        }

        temp[this.listVeiculos.length] = veiculo;

        this.listVeiculos = temp;

        return true;

    }

    /**
     * Verifica pelo id se o Veiculo já existe.
     *
     * @param veiculo
     * @return true - se já existir || falso - se não existir
     */
    public boolean isExist(Veiculo veiculo) {

        for (int i = 0; i < this.listVeiculos.length; i++) {

            if (this.listVeiculos[i].getVin()== veiculo.getVin()) {
                return true;
            }
        }
        return false;
    }

    public boolean removeVeiculo(int vinVeiculo) {

        int pos = this.findVeiculo(vinVeiculo);

        if (pos == -1) {
            return false;
        }

        Veiculo temp[] = new Veiculo[this.listVeiculos.length - 1];
        this.listVeiculos[pos] = null;
        int c = 0;

        for (int i = 0; i < this.listVeiculos.length; i++) {

            if (this.listVeiculos[i] != null) {

                temp[c] = this.listVeiculos[i];
                c++;

            }
        }
        
        this.listVeiculos = temp;
        
        return true;

    }

    public int findVeiculo(int vinVeiculo) {

        for (int i = 0; i < this.listVeiculos.length; i++) {

            if (this.listVeiculos[i].getVin() == vinVeiculo) {
                return i;
            }
        }

        return -1;
    }

    public String ableVeiculo(){
        
        int cauto = 0, cmoto = 0, cpesa = 0;
        String msgauto = "", msgmoto = "", msgpesa = "";
        
        for(int i = 0; i < this.listVeiculos.length; i++){
            if(this.listVeiculos[i] instanceof Automovel){
                cauto++;
                msgauto += this.listVeiculos[i].toString();
            } else if(this.listVeiculos[i] instanceof Motociclo){
                cmoto++;
                msgmoto += this.listVeiculos[i].toString();
            } else {
                cpesa++;
                msgpesa += this.listVeiculos[i].toString();
            }
        }

        return "Automovel: " + msgauto + "Num Automoveis: " + cauto + "Motociclos: " + msgmoto + "Num Motociclos: " + cmoto + "Pesados: " + msgpesa + "Num Pesados: " + cpesa;
    }
    
    public String listVeiculo(){
        
        String list = "";
        
        for(int i = 0; i < this.listVeiculos.length; i++){
            list +=this.listVeiculos[i].toString();
        }
        
        return "Veiculos: " + list;
    }
}
